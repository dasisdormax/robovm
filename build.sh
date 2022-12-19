#!/bin/sh
set -e

# Build
mvn clean install
./plugins/gradle/gradlew -b plugins/gradle/build.gradle clean assemble publishToMavenLocal
./plugins/idea/gradlew -b plugins/idea/build.gradle clean buildPlugin
# mvn -f plugins/eclipse/pom.xml clean install

# Copy IDEA plugin
cp plugins/idea/build/distributions/idea*.zip .

# Clear gradle and robovm caches
rm -rf ~/.robovm-sdks
rm -rf ~/.gradle/caches/modules-2/files-2.1/com.mobidevelop.robovm
