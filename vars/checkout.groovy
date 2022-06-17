def call (String git_repo_url="", String git_cred="", String branch="")
{
    echo "Cloning started "
    checkout(
                [$class: 'GitSCM', branches: [[name: */master]],
                 userRemoteConfigs: [[credentialsId: '$git_cred',url: '$git_repo_url']]], 
              )
}/
