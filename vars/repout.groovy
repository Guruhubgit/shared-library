def call(String git_repo_url, String CredentialId){
    echo "Cloning started"
     checkout(
                [$class: 'GitSCM', branches: [[name: '*/master']],
                 userRemoteConfigs: [[credentialsId: '$CredentialId', url: 'https://github.com/Guruhubgit/shared-library.git']]],
     )
}
