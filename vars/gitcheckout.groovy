def call(String gitUrl, String branch = 'krishna') {
    echo "Checking out repo ${gitUrl} branch ${branch}"

    checkout([$class: 'GitSCM', 
        branches: [[name: branch]], 
        userRemoteConfigs: [[url: gitUrl]]
    ])
}

