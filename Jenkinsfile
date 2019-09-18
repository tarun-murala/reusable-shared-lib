def pipeline
node {
    // Git checkout before load source the file
    checkout scm

    // To know files are checked out or not
    sh '''
        ls -lhrt
    '''

    def rootDir = pwd()
    println("Current Directory: " + rootDir)

    // point to exact source file
    def buildTest = load "${rootDir}/vars/build-test.groovy"

    stage('checkout git') {
        steps {
            scm checkout
        }
    }
    buildTest.build()
    buildTest.test()
}