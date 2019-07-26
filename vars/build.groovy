#!/usr/bin/env groovy
def checkout() {
    stage('build') {
        steps {
            sh 'mvn clean package -DskipTests=true'
        }
    }    
}
