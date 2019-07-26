#!/usr/bin/env groovy
def call() {
    stage ('test') {
        steps {
            sh 'mvn test -Dpublish'
        }
    }   
}
