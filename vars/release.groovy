def call(String project) {
    dockerLogin()
    sh "docker image push reach/${project}:latest"
    sh "docker image push reach/${project}:${currentBuild.displayName}"
    dockerLogout()
}
