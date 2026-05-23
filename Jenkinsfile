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

                dir('rock-paper-scissor') {

                    sh 'mvn clean compile'

                }

            }

        }

        stage('Package') {

            steps {

                dir('rock-paper-scissor') {

                    sh 'mvn package'

                }

            }

        }

    }
}
