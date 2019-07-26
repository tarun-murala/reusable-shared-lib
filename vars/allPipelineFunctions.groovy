#!/usr/bin/env groovy
package com.allfunctions;

def build() {
    mvn clean install -DskipTests=true
}

def test() {
    mvn test -Dpublish
}

def deploy() {
    echo "Deployed!"
}