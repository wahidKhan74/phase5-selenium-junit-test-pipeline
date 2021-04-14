pipeline {
    agent any
    
    triggers {
    	pollSCM('* * * * *')
    }
    
    stages {
    
    	stage('compile stage') {
            steps {
                sh 'mvn --version'
            }
        }
        
        stage('build stage') {
            steps {
                sh 'mvn --version'
            }
        }
        
    }
}
