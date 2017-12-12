def call(String service) {
    slackSend(
          color: "danger",
          message: """$service could not be scaled.
Please check Jenkins logs for the job ${env.JOB_NAME} #${env.BUILD_NUMBER}
${env.RUN_DISPLAY_URL}"""
        )
}
