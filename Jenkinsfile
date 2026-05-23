pipeline {

    agent any

    tools {

        maven 'Maven3'
        jdk 'JDK17'

    }

    stages {

        stage('Checkout') {

            steps {

                git branch: 'main',
                url: 'https://github.com/Prahas0728/Maven-project.git'

            }

        }

        stage('Build') {

            steps {

                dir('rock-paper-scissors') {

                    sh 'mvn clean compile'

                }

            }

        }

        stage('Package') {

            steps {

                dir('rock-paper-scissors') {

                    sh 'mvn package'

                }

            }

        }

    }

    post {

        success {

            mail to: 'nandan56562@gmail.com',
            subject: 'Jenkins Build Success',
            body: 'Rock Paper Scissors project built successfully.'

        }

        failure {

            mail to: 'nandan56562@gmail.com',
            subject: 'Jenkins Build Failed',
            body: 'Build failed. Check Jenkins logs.'

        }

    }

}
