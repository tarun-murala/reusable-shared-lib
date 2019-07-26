#!/usr/bin/env groovy
def call() {
    stage('checkout git') {
        steps {
            scm checkout
        }
    }    
}
