pipeline {
       agent { label 'win' }
	    tools {
        maven 'Maven_3.5.2' 
    }
    stages {
        stage('Compile') {
		steps {
                withMaven(maven:'mvn'){
				sh 'mvn clean compile'
				}
			}
        }
        stage('Test') {
            steps {
			withMaven(maven:'mvn'){
				sh 'mvn install'
				}
            }
        }
        stage('Deploy') {
            steps {
			withMaven(maven:'mvn'){
				sh 'mvn deploy'
				}
            }
        }
    }
}