node {
   def GRADLE_HOME = tool name: 'Gradle 4.2.1', type: 'hudson.plugins.gradle.GradleInstallation'

    stage('get from repo') {
        git url: 'https://github.com/FanaticalTest/ft-config.git'
    }

    stage('test') {
        sh "${GRADLE_HOME}/bin/gradle build"
    }

    stage('build') {
        sh "${GRADLE_HOME}/bin/gradle install"
    }
}
