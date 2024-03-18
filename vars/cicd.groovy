def newGit(repo)
{
  git "${repo}"
}
def newMaven()
{
  sh 'mvn package'
}
//def newDeploy(ip,contextPath)
//{
  //sh "deploy adapters: [tomcat9"credentialsId: '2d7bffd1-b890-4532-a303-e2f1dcf6d44a', path: '', url: ${ip}"], contextPath: ${contextPath}, war: '**/*.war'"
//}
def newTest(jobname)
{
  sh 'java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar'
}

