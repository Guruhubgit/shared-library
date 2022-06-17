def call(def giturl, def branch, def credentialsId){
    echo "Cloning started"
     checkout(
                [$class: 'GitSCM', branches: [[name: '*/branch']],
                 userRemoteConfigs: [[credentialsId: 'credentialsId', url: 'giturl']]],
     )
}
