def call(String repo) {
  withCredentials([usernamePassword(
      credentialsId: "devreach",
      usernameVariable: "USER",
      passwordVariable: "PASS"
  )]) {
      sh "git config user.email 'dev@rea.ch'"
      sh "git config user.name 'devreach'"
      sh "git tag -a ${currentBuild.displayName} -m '${currentBuild.displayName}'"
      sh "git push git://${USER}:${PASS}@github.com/reach-service/${repo}.git --tags"
  }
}
