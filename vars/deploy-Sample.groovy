#!/usr/bin/env groovy

def call(body) {
    echo "Start Deploy"
    sleep(5);

    // new Deployer(script:this).run()
    echo "Deployed"
    // currentBuild.result = 'SUCCESS' //FAILURE to fail

    return this
}
