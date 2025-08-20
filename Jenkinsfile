pipeline {
    agent any

    tools {
        maven 'Maven3' // Nombre exacto de la instalación de Maven en Jenkins
    }

    stages {
        stage('Clonar repositorio') {
            steps {
                git branch: 'main', url: 'https://github.com/Efrain-24/POGRAMACION-III.git'
            }
        }

        stage('Compilar') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'mvn clean compile'
                    } else {
                        bat 'mvn clean compile'
                    }
                }
            }
        }

        stage('Pruebas') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'mvn test'
                    } else {
                        bat 'mvn test'
                    }
                }
            }
            post {
                always {
                    // Imprime el contenido de la carpeta de reportes para depuración
                    script {
                        if (isUnix()) {
                            sh 'ls -R target/surefire-reports'
                        } else {
                            bat 'dir target\\surefire-reports'
                        }
                    }
                    // Publica los resultados de JUnit
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }
}
