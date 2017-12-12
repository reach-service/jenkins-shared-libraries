def call(String repo) {
  echo "repository host: ${repositoryHost}" // github.com
  echo "repository path: ${repositoryPath}" // <user>/<repository>.git
  echo "repository jenkins credentials id: ${credentialsId}"  // jenkins credentials for the jenkins git account who have commit access
  echo "repository branch: ${branch}" // master or another branch
  echo "repository commiter username: ${repositoryCommiterUsername}" // Jenkins account email
  echo "repository commiter name: ${repositoryCommiterEmail}" // Jenkins

  withCredentials([usernamePassword(
      credentialsId: "devreach",
      usernameVariable: "USER",
      passwordVariable: "PASS"
  )]) {
      sh "git config user.email 'dev@rea.ch'"
      sh "git config user.name 'devreach'"
      sh "git tag -a ${currentBuild.displayName} -m '${currentBuild.displayName}'"
      sh "git push https://${USER}:${PASS}@github.com/reach-service/${repo}.git --tags"
  }
}
