def gitdownload(repo)
{
  git "${repo}"
}

def newMaven()
{
  sh 'mvn package'
}

def newDeploy(jobName,IP,context)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${jobName}/webapp/target/webapp.war ubuntu@${IP}:/opt/tomcat9/webapps/${context}.war"
}

def seleniumTesting(jobname)
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/${jobName}/testing.jar"
}
