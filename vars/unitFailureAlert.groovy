def call(String project) {
    slackSend(
          color: "danger",
          message: """Unit test failed for reach/${project}.
Please check Jenkins logs for the job ${env.JOB_NAME} #${env.BUILD_NUMBER}
${env.RUN_DISPLAY_URL}"""
        )
}
