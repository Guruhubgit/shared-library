def call(giturl, branch){
    echo "Cloning started"
     checkout(
                [$class: 'GitSCM', branches: [[name: '*/branch']],
                 userRemoteConfigs: [[credentialsId: 'mine', url: 'giturl']]],
     )
}
