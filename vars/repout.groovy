def call(def giturl, def branch, def user){
    echo "Cloning started"
     checkout(
                [$class: 'GitSCM', branches: [[name: '*/branch']],
                 userRemoteConfigs: [[credentialsId:'user', url: 'giturl']]],
     )
}
