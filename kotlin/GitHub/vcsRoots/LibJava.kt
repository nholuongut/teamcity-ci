package GitHub.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object LibJava : GitVcsRoot({
    uuid = "f72acdd0-1227-49d2-87e0-eedd42ddba03"
    name = "https://github.com/Nholuongut/lib-java"
    url = "https://github.com/Nholuongut/lib-java"
    branch = "refs/heads/master"
})
