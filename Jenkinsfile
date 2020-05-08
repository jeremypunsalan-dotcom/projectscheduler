pipeline {
	environment {
    	registry = "jeremypunsalandotcom/projectscheduler"
    	registryCredential = ‘dockerhub’
    	dockerImage = ''
	}
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn test' 
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml' 
                }
            }
        }
        stage('Image Build') {
      		steps{
        		script {
          			dockerImage = docker.build registry + ":$BUILD_NUMBER"
        		}
      		}
    	}
    	stage('Image Deploy') {
      		steps{
        		script {
          			docker.withRegistry( '', registryCredential ) {
            			dockerImage.push()
          			}
        		}
      		}
    	}
    	stage('Image Delete') {
      		steps{
        		sh "docker rmi $registry:$BUILD_NUMBER"
      		}
    	}
    	
    }
}