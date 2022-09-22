def build(String arg1) {
        sh """
        echo "from build function : ${arg1}"
        """
}

return this