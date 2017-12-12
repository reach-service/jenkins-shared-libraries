def call(String serviceName, String environment) {
    slackSend(
            color: "danger",
            message: """${serviceName}:${currentBuild.displayName} could not be deployed in ${environment}.
Please check Jenkins logs for the job ${env.JOB_NAME} #${env.BUILD_NUMBER}
${env.RUN_DISPLAY_URL}"""
    )
}
