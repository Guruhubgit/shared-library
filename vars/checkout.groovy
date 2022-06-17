def call (String git_repo_url="", String git_cred="", String git_branch="")

{
    echo "Cloning started "

    checkout(
                [$class: 'GitSCM', branches: [[name: '*/$git_branch']],
                 userRemoteConfigs: [[credentialsId: '$git_cred',url: '$git_repo_url']]],

        )
}

