def gitdownload(repo)
{
  git "${repo}"
}

def newMaven()
{
  sh 'mvn package'
}

def newDeploy(jobName,IP,contextpath)
{
  sh 'scp /home/ubuntu/.jenkins/workspace/{jobName}/webapp/target/webapp.war ubuntu@{IP}:/opt/tomcat9/webapps/${contextPath}.war'
}

