# TeamCity CI Config

![](https://i.imgur.com/waxVImv.png)
### [View all Roadmaps](https://github.com/nholuongut/all-roadmaps) &nbsp;&middot;&nbsp; [Best Practices](https://github.com/nholuongut/all-roadmaps/blob/main/public/best-practices/) &nbsp;&middot;&nbsp; [Questions](https://www.linkedin.com/in/nholuong/)
<br/>

[TeamCity](https://www.jetbrains.com/teamcity/) CI configurations, synchronized from my automated TeamCity cluster.

## TeamCity configuration

- `.teamcity/` - XML format live sync'd
- `exports/` - JSON exports using API scripts in [DevOps Bash tools](https://github.com/nholuongut/devops-bash-tools) repo
- `kotlin/` - Kotlin exports from UI
- `.teamcity.vcs.oauth.json` - VCS connection to this repo via OAuth
- `.teamcity.vcs.ssh.json` - VCS connection to this repo via SSH key

[teamcity.sh](https://github.com/nholuongut/devops-bash-tools/blob/master/teamcity.sh) - one-shot TeamCity cluster on Docker with automated agent authorization and VCS integration via API calls.

TeamCity on Docker - [docker-compose.yml](https://github.com/nholuongut/devops-bash-tools/blob/master/setup/teamcity-docker-compose.yml)

TeamCity on Kubernetes configurations are [here](https://github.com/nholuongut/kubernetes-configs).

## Automation

- [Kubernetes configs](https://github.com/nholuongut/kubernetes-configs) - extensive Kubernetes configurations, including TeamCity-on-Kubernetes & Jenkins-on-Kubernetes, plus advanced templates for most major kubernetes objects

- [DevOps Bash tools](https://github.com/nholuongut/devops-bash-tools):
  - [teamcity.sh](https://github.com/nholuongut/devops-bash-tools/blob/master/teamcity.sh) - launches a [TeamCity](https://www.jetbrains.com/teamcity/) cluster in Docker
    - auto-loads VCS with all the builds
  - [teamcity_api.sh](https://github.com/nholuongut/devops-bash-tools/blob/master/teamcity/teamcity_api.sh) - query the [TeamCity API](https://www.jetbrains.com/help/teamcity/rest-api.html), handling authentication and other details
  - [jenkins.sh](https://github.com/nholuongut/devops-bash-tools/blob/master/jenkins.sh) - one-touch [Jenkins CI](https://jenkins.io/) instance in Docker
    - auto-loads and builds a pipeline from `Jenkinsfile`
  - [concourse.sh](https://github.com/nholuongut/devops-bash-tools/blob/master/cicd/concourse.sh) - one-touch [Concourse CI](https://concourse-ci.org/) instance in Docker
    - auto-loads and builds a pipeline from `.concourse.yml`
  - [gocd.sh](https://github.com/nholuongut/devops-bash-tools/blob/master/cicd/gocd.sh) - one-touch [GoCD CI](https://www.gocd.org/) cluster in Docker
    - auto-loads and builds a pipeline from a config repo

### See Also

- [Templates](https://github.com/Nholuongut/templates) - templates for many CI systems, code and configs eg. advanced Jenkinsfile & Jenkins Shared Library (Groovy), GitHub Actions, Travis CI, CircleCI, AWS CodeBuild, GCP Cloud Build, Makefile, Vagrantfile, Dockerfile, docker-compose.yml etc.

- [Advanced Nagios Plugins](https://github.com/Nholuongut/nagios-Plugins) - 450+ production monitoring checks including for the Jenkins API

### CI Systems

All my [major GitHub repos](https://github.com/Nholuongut) contain fully working live configs for most major CI system out there.

See [CI/CD](https://github.com/Nholuongut/knowledge-Base/blob/main/ci-cd.md) notes in my public Knowledge Base for more details and comparisons between different CI/CD systems.

#### Local CI

You can boot any of these CI and run the repo's build with a single short one-word command using the scripts above.

- [Jenkins](https://www.jenkins.io/) - `Jenkinsfile` at the top of each repo
- [Concourse](https://concourse-ci.org/) - `.concourse.yml` at the top of each repo
- [GoCD](https://www.gocd.org/) - `setup/gocd_config_repo.json` in each repo
- [TeamCity](https://www.jetbrains.com/teamcity/) - `.teamcity.vcs.oauth.json` / `.teamcity.vcs.ssh.json` connection to this repo

##### Hosted CI

- [AppVeyor](https://www.appveyor.com/)
- [AWS CodeBuild](https://aws.amazon.com/codebuild/)
- [Azure DevOps Pipelines](https://dev.azure.com/)
- [BitBucket Pipelines](https://bitbucket.org/product/features/pipelines)
- [Buddy](https://buddy.works/)
- [BuildKite](https://buildkite.com/)
- [Circle CI](https://circleci.com/)
- [Cirrus CI](https://cirrus-ci.org/)
- [CodeShip](https://codeship.com/)
- [Codefresh](https://codefresh.io/)
- [Drone.io](https://drone.io/)
- [GCP Cloud Build](https://cloud.google.com/cloud-build)
- [GitHub Actions Workflows](https://github.com/features/actions)
- [GitLab CI](https://docs.gitlab.com/ee/ci/)
- [Semaphore CI](https://semaphoreci.com/)
- [Shippable](https://www.shippable.com/)
- [Travis CI](https://travis-ci.org/)

# 🚀 I'm are always open to your feedback.  Please contact as bellow information:
### [Contact ]
* [Name: nho Luong]
* [Skype](luongutnho_skype)
* [Github](https://github.com/nholuongut/)
* [Linkedin](https://www.linkedin.com/in/nholuong/)
* [Email Address](luongutnho@hotmail.com)
* [PayPal.me](https://www.paypal.com/paypalme/nholuongut)

![](https://i.imgur.com/waxVImv.png)
![](Donate.png)
[![ko-fi](https://ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/nholuong)

# License
* Nho Luong (c). All Rights Reserved.🌟