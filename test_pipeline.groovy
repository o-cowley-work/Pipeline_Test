pipeline {
	agent any
	stages {
	    
		stage('Build') {
			steps {
				echo 'Doing a second thing'
				bat 'Build.bat'
			}
		}
		
		stage('JUnit') {
			steps {
				echo 'JUnit Successfully'
				bat 'Unit.bat'
			}
		}
		
		stage('Quality') {
			steps {
				echo 'Qual Successfully'
				bat 'Quality.bat'
			}
		}
		
		stage('Deploy') {
			steps {
				echo 'Pass'
				bat 'Deploy.bat'
			}
		}
	}
	
	post {
		always {
			echo 'Run Always'
		}
		
		success {
			echo 'Run on pass'
		}
		
		failure {
			echo 'Run on failure'
		}
		
		unstable {
			echo 'Run on unstable'
		}
		
		changed {
			echo 'Run if pipeline changed status'
		}
	}
}
		
		
		