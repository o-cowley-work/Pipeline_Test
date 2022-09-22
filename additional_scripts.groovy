def build(String arg1) {
        sh """
        echo "from build function : ${arg1}"
        """
}