pipeline{
    agent any 
    options {
        timestamps ()
        skipDefaultCheckout(true)
    }
    stages{
        stage("First Block"){
        steps{
            script{
            echo "This is First block"
            }
            }
        }
        stage("Second Block"){
            steps{
                script{
                echo "This is Second Block"
        }
        }
    }
}
