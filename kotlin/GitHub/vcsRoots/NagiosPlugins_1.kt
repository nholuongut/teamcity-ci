package GitHub.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object NagiosPlugins_1 : GitVcsRoot({
    uuid = "544011f6-61cd-4064-ac46-c6841137e241"
    id("NagiosPlugins")
    name = "https://github.com/Nholuongut/nagios-Plugins"
    url = "https://github.com/Nholuongut/nagios-Plugins"
    branch = "refs/heads/master"
})
