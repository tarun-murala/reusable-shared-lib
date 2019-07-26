#!/usr/bin/env groovy
def checkout() {
    stage ('test') {
        steps {
            sh 'mvn test -Dpublish'
        }
    }   
}
