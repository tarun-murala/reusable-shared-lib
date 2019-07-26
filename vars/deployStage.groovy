#!/usr/bin/env groovy
def checkout() {
    stage('deploy'){
        steps {
            echo 'Deploy'
        }
    }    
}
