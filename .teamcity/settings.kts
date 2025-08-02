version = "2022.10"

project {
    buildType {
        id("BuildAndDockerize")
        name = "Build and Dockerize"

        vcs {
            root(DslContext.settingsRoot)
        }

        steps {
            script {
                name = "Say hello"
                scriptContent = "echo 'Building app...'"
            }

            script {
                name = "Docker build"
                scriptContent = """
                    docker build -t my-app:latest .
                """.trimIndent()
            }
        }

        artifacts {
            artifactRules = "Dockerfile"
        }

        triggers {
            vcs {
            }
        }
    }
}

