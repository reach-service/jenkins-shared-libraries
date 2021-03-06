def call(String project) {
    sh "docker image build -t reach/${project}:latest -f Dockerfile ."
    sh "docker image tag reach/${project}:latest reach/${project}:${currentBuild.displayName}"
    if (fileExists('Dockerfile.test')) {
        sh "docker image build -t reach/${project}-test -f Dockerfile.test ."
    }
}
