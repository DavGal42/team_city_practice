import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

version = "2024.03"

project {
    name = "TeamCityPractice"

    buildType(BuildHelloWorld)
}

object BuildHelloWorld : BuildType({
    name = "Hello World Build"

    steps {
        script {
            name = "Print Hello World"
            scriptContent = """echo "hello world""""
        }
    }
})

