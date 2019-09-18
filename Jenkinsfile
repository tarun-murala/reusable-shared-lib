node {
    // Git checkout before load source the file
    stage('checkout git') {
        steps {
            scm checkout
        }
    }

    // To know files are checked out or not
    sh '''
        ls -lhrt
    '''

    def rootDir = pwd()
    println("Current Directory: " + rootDir)

    // point to exact source file
    def buildTest = load "${rootDir}/vars/build-test.groovy"
    buildTest.build()
    buildTest.test()
}