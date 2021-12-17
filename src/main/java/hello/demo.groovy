pipeline {
    agent any

    triggers {
        pollSCM('* * * * *') //polling for changes, here once a minute 
    } 
    stages {
        stage('checkout') {
            steps {
                checkout([$class: 'GitSCM',
                 branches: [[name: 'refs/tags/${TAG}']],
                  extensions: [],
                   userRemoteConfigs: [[url: 'https://github.com/vishal77418/java-hello-world-with-maven.git']]])
            }
            steps {
                triggers {
                    pollSCM('* * * * *')
                }
            }  
        }
    }
}