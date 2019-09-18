#!/usr/bin/env groovy
def build() {
    stage('build') {
        steps {
            sh 'mvn clean package -DskipTests=true'
        }
    }
}
def test() {
    stage ('test') {
        steps {
            sh 'mvn test -Dpublish'
        }
    }
}

return this