def doStuff(String arg1) {
        stage("External script stage") {
                echo "Here I am in another file $arg1"
        }

        stage ("Checking visibility of variables from the parent script") {
                
                echo "I did get to that variable"
        }
        
}

def runProps2(String add_name="${env.PROJECT_NAMES}") {
    properties([parameters([string(name: 'PROJECT_NAMES', defaultValue: add_name, description: "Project name(s), available projects: ${env.PROJECT_NAMES} or ALL"),
                                string(name: 'ANOTHER_THING', defaultValue: env.ANOTHER_THING, description: "SOME OTHER THING: ${env.ANOTHER_THING} or ALL")])])
}

return this;