def call(String project, String stackName, String serviceName) {
    script {
      try {
        sh "docker service update --image reach/${project}:${currentBuild.displayName} ${stackName}_${serviceName} --detach=false"
      } catch (e) {
        sh "docker service update --rollback ${stackName}_${serviceName} --detach=false"
        deployFailureAlert(${serviceName})
        error "Failed to update the service ${serviceName}"
      }
    }
}
