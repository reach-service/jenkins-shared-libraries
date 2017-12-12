def call(String serviceName) {
    slackSend(
            color: "danger",
            message: """${serviceName}:${currentBuild.displayName} could not be deployed.
Please check Jenkins logs for the job ${env.JOB_NAME} #${env.BUILD_NUMBER}
${env.RUN_DISPLAY_URL}"""
    )
}
