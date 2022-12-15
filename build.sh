#!/bin/sh
set -e
mvn clean install
./plugins/gradle/gradlew -b plugins/gradle/build.gradle clean assemble publishToMavenLocal
./plugins/idea/gradlew -b plugins/idea/build.gradle clean buildPlugin
cp plugins/idea/build/distributions/idea*.zip .
# mvn -f plugins/eclipse/pom.xml clean install
