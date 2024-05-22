def call() {
    stage("clone repo") {
       
            script {
                sh """
                    echo "clone repo"
                """
            }
        }
    }


