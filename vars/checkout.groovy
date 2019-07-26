#!/usr/bin/env groovy
def checkout() {
    stage('checkout git') {
        steps {
            scm checkout
        }
    }    
}
