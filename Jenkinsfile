pipeline {
	agent none
	stages {
	    
		stage('Non Parallel Stage') {
		    agent {
		        label "built-in"
		    }
			steps {
				echo 'Doing a first thing'
				
			}
		}
		
		stage('Run in Parallel') {
		    parallel {
    		    stage('Run on agent') {
    		        agent {
    		            label 'Windows_Node'
    		        }
        			steps {
        				echo 'Ran on the agent successfully'
        				
        			}
    		    }
    		
    		    stage('Ran on the master') {
    		        agent {
    		            label 'built-in'
    		        }
        			steps {
        				echo 'Ran this on the master'
        				
        			}
    		    }
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
		
		
		
