node{
    stage('Compile'){
        git credentialsId: '37cc48bd-981d-4263-96be-86b430cefdcd', url: 'https://github.com/EmmaEyckmans/DevopsJenkins.git'
        sh 'chmod +x ./gradlew'
        sh './gradlew compileTestJava'
    }
    stage("Test"){
        echo "In stage Test"
    }
}