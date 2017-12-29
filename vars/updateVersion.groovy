def call(filename) {
  if (fileExists("${filename}")) {
    sh "echo version=${currentBuild.displayName} > ${filename}"
  }
}
