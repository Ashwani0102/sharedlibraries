def gitdownload(repo)
{
  git "${repo}"
}

def newMaven()
{
  sh 'mvn package'
}

def newDeploy(workspace,IP,context)
{
  sh "scp ${workspace}/webapp/target/webapp.war ubuntu@${IP}:/opt/tomcat9/webapps/${context}.war"
}

def seleniumTesting(workspace)
{
  sh "java -jar ${workspace}/testing.jar"
}
