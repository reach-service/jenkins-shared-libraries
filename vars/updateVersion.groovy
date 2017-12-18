def call(filename) {
  if (fileExists('${filename}') {
    f = new File('${filename}')
    file.write "version=${env.BUILD_NUMBER}\n"
    }
}
