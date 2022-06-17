def call(String git_repo_url="", CredentialId=""){
    echo "Cloning started "
     checkout(
                [$class: 'GitSCM', branches: [[name: '*/master']],
                 userRemoteConfigs: [[credentialsId: '$CredentialId: '$git_repo_url']]],
     )
}
