def call(String project) {
  script {
    try {
      sh "docker rmi reach/${project}:latest reach/${project}:${currentBuild.displayName} reach/${project}-test"
    } catch (e) {
      echo "Caught: ${err}"
    }
  }
}
