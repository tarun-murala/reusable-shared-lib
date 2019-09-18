#!/usr/bin/env groovy
def build() {
    stage('build') {
        withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
            sh 'mvn clean install -DskipTests'
        }
    }
}
def test() {
    stage ('test') {
        withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
            sh 'mvn test -Dpublish'
        }
    }
}

return this