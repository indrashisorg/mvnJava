@Library('jenkinsSharedLib@master') _ 
 node {
     mvn =   tool name: 'mvn', type: 'maven'
     echo "Indrashis>>>>>>>>>>>>>>"
     echo mvn
    }
pipeline {
       agent { label 'win' }
	 
    stages {
        stage('Compile') {
		steps {
				sh 'mvn -f HelloWorldJava/pom.xml clean compile'
				
			}
        }
        buildJava()
        stage('Deploy') {
            steps {
                echo "Come later"
		   //  sh 'mvn -f HelloWorldJava/pom.xml deploy'
				
            }
        }
    }
}