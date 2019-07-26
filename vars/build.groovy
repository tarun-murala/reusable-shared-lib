#!/usr/bin/env groovy
def call() {
    stage('build') {
        steps {
            sh 'mvn clean package -DskipTests=true'
        }
    }    
}
