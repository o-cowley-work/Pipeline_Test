def doStuff(String arg1) {
        stage("External script stage") {
                echo "Here I am in another file $arg1"
        }
        
}

return this;