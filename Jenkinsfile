node{
    stage('Compile'){
        git credentialsId: '37cc48bd-981d-4263-96be-86b430cefdcd', url: 'https://github.com/EmmaEyckmans/DevopsJenkins.git'
        sh 'chmod +x ./gradlew'
        sh './gradlew compileTestJava'
    }
    stage("Test"){
        try{
            sh './gradlew test'
        }
        finally{
            archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
            junit 'build/reports/**/*.xml'
        }
    }
}