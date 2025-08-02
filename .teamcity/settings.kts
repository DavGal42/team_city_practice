import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

version = "2022.10"

project {
    buildType(BuildAndDockerize)
}

object BuildAndDockerize : BuildType({
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
        vcs {}
    }
})

