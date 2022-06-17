def call(String git_repo_url="https://github.com/Guruhubgit/shared-library.git", String CredentialId="mine"){
    echo "Cloning started"
     checkout(
                [$class: 'GitSCM', branches: [[name: '*/master']],
                 userRemoteConfigs: [[credentialsId: '$CredentialId', url: '$git_repo_url']]],
     )
}
