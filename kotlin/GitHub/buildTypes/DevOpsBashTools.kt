package GitHub.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object DevOpsBashTools : BuildType({
    templates(Nholuongut_Make)
    uuid = "e5abcae2-bee5-41c8-9e43-33ccfd28178c"
    name = "DevOps Bash tools"
    description = "550+ DevOps Bash Scripts - AWS, GCP, Kubernetes, Kafka, Docker, APIs, Hadoop, SQL, PostgreSQL, MySQL, Hive, Impala, Travis CI, Jenkins, Concourse, GitHub, GitLab, BitBucket, Azure DevOps, TeamCity, Spotify, MP3, LDAP, Code/Build Linting, pkg mgmt for Linux, Mac, Python, Perl, Ruby, NodeJS, Golang, Advanced dotfiles: .bashrc, .vimrc, .gitconfig, .screenrc, .tmux.conf, .psqlrc ..."

    vcs {
        root(GitHub.vcsRoots.DevOpsBashTools_1)

        branchFilter = ""
    }
})
