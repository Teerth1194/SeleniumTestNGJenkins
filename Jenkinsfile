pipeline {
    agent any

    // tools {
    //     // Install the Maven version configured as "M3" and add it to the path.
    //     maven "M3"
    // }

    parameters {
        choice choices: ['Production', 'Staging'], description: 'Select an environment on which you want to run the test', name: 'ENV'
        choice choices: ['AllTest', 'DriverTest', 'EnvTest', 'UrlTest'], name: 'SUITE'
        choice choices: ['chrome', 'edge', 'firefox'], description: 'Select an driver to run test', name: 'BROWSER'
    }

    stages {
        stage('Test') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/Teerth1194/SeleniumTestNGJenkins.git'

                // Run Maven on a Unix agent.
                // sh "mvn clean test-Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                bat "mvn clean test -DBROWSER=${BROWSER} -DsuiteXmlFile=${SUITE}.xml"
            }
        }
    }
}
