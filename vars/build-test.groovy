#!/usr/bin/env groovy
def build() {
    stage('build') {
        sh '${mvnHome}/bin/mvn clean package -DskipTests=true'
    }
}
def test() {
    stage ('test') {
        sh '${mvnHome}/bin/mvn test -Dpublish'
    }
}

return this