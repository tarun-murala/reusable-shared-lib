#!/usr/bin/env groovy
def call() {

    pipeline {
        agent any
        stages {

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