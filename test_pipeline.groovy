def build_fn() {
	echo 'Doing a second thing'
	bat 'Build.bat'
}

def unit_fn(){
	echo 'JUnit Successfully'
	bat 'Unit.bat'			
}
		
def qual_fn() {
	echo 'Qual Successfully'
	bat 'Quality.bat'
}

		
def deploy_fn(){
				echo 'Pass'
				bat 'Deploy.bat'
}
	

		
		
		