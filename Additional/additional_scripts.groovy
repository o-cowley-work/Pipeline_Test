def doStuff(String arg1) {
        stage("External script stage") {
                echo "Here I am in another file $arg1"
        }

        stage ("Checking visibility of variables from the parent script") {
                
                echo "I did get to that variable"
        }
        
}

return this;