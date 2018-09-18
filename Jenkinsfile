pipeline{
    agent any
    stages {
        stage('Compile-Stage'){
            steps{
                withMaven(maven:'Apache Maven 3.5.4'){
                    sh 'mvn clean install'
                }
            }
            stage('Compile-Test'){
            steps{
                withMaven(maven:'Apache Maven 3.5.4'){
                    sh 'mvn  test'
                }
            }
                stage('Deploy-Stage'){
            steps{
                withMaven(maven:'Apache Maven 3.5.4'){
                    sh 'mvn deploy'
                }
            }
 
 
        }
    
            }
