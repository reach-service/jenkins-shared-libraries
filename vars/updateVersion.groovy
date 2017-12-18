def call(filename) {
  if (fileExists("${filename}")) {
    sh "echo version=${env.BUILD_NUMBER} >> ${filename}"
  }
}
