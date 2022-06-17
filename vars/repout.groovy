def call(String git_repo_url="https://github.com/Guruhubgit/shared-library.git", String CredentialId="mine"){
    echo "Cloning started"
    echo "$git_repo_url"
     checkout(
                [$class: 'GitSCM', branches: [[name: '*/master']],
                 userRemoteConfigs: [[credentialsId: '$CredentialId', url: '$git_repo_url']]],
     )
}
