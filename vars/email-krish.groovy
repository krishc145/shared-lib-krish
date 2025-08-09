def call() {
    def buildStatus = currentBuild.currentResult ?: 'UNKNOWN'
    def buildNumber = env.BUILD_NUMBER
    def jobName = env.JOB_NAME
    def buildUrl = env.BUILD_URL

    def subject = "Build #${buildNumber} - ${jobName} - Status: ${buildStatus}"
    def body = """
        <p>Hello Krish,</p>
        <p>The build <b>#${buildNumber}</b> of job <b>${jobName}</b> has finished with status: <b>${buildStatus}</b>.</p>
        <p>Check details: <a href="${buildUrl}">${buildUrl}</a></p>
        <br/>
        <p>Regards,<br/>Jenkins</p>
    """

    emailext (
        to: 'krishnakumarchinnusamy@gmail.com',
        subject: subject,
        body: body,
        mimeType: 'text/html'
    )
}

