def call(String repo) {
  withCredentials([usernamePassword(
      credentialsId: "devreach",
      usernameVariable: "USER",
      passwordVariable: "PASS"
  )]) {
      sh "git tag -a ${currentBuild.displayName} -m '${currentBuild.displayName}'"
      sh "git push https://${USER}:${PASS}@reach-service/${repo} --tags"
  }
}
