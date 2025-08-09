def call(String mavenHome = '', String goals = 'clean package') {
    echo "Running Maven build with goals: ${goals}"

    def mvn = mavenHome ? "${mavenHome}/bin/mvn" : 'mvn'

    sh "${mvn} ${goals}"
}

