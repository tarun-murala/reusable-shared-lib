#!/usr/bin/env groovy
def build() {
    stage('build') {
        sh 'mvn clean package -DskipTests=true'
    }
}
def test() {
    stage ('test') {
        sh 'mvn test -Dpublish'
    }
}

return this