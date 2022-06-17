def call(def giturl, def branch ){
    echo "Cloning started"
     checkout(
                [$class: 'GitSCM', branches: [[name: '*/branch']],
                 userRemoteConfigs: [[url: 'giturl']]],
     )
}
