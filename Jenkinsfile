pipeline {
    agent any
    
    triggers {
    	pollSCM('* * * * *')
    }
    
    stages {
    
    	stage('compile stage') {
            steps {
                echo '----------------- This is a compile phase ----------'
                sh 'mvn clean compile'
            }
        }
        
        stage('test stage') {
            steps {
                echo '----------------- This is a test phase ----------'
                sh 'mvn clean test'
            }
        }
        
        stage('build stage') {
            steps {
                echo '----------------- This is a build phase ----------'
                sh 'mvn clean package -DskipsTest'
            }
        }
        
        stage('deploy stage') {
            steps {
                 echo '----------------- This is a deploy phase ----------'
            }
        }
        
    }
}
