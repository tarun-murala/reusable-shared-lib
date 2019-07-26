#!/usr/bin/env groovy
def call(params) {
    
    pipeline {
        agent any
        stages {
            stage('checkout') {
                steps {
                    scm checkout
                }
            }

            stage('build') {
                steps {
                    sh 'mvn clean package -DskipTests=true'
                }
            }

            stage ('test') {
                steps {
                    sh 'mvn test -Dpublish'
                }
            }

            stage('deploy'){
                steps {
                    echo 'Deploy'
                }
            }
        }
        
    }
}