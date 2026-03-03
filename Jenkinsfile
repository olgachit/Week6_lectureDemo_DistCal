pipeline {
    agent any
    environment {
        PATH = "${env.PATH}:/Applications/Utilities/Terminal.app" // Update the PATH to include the directory of cmd.exe
        GIT_CREDENTIALS = credentials('olgachit')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', credentialsId: 'olgachit', url: 'https://github.com/olgachit/Week6_lectureDemo_DistCal.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps{
                bat 'mvn test'
            }
            post {
                success {
                    // Publish JUnit test results
                    junit '**/target/surefire-reports/TEST-*.xml'
                    // Generate JaCoCo code coverage report
                    jacoco(execPattern: '**/target/jacoco.exec')
                }
            }
        }
    }
}