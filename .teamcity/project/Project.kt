package project

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.project
import jetbrains.buildServer.configs.kotlin.BuildType

object Project : Project({
    name = "TeamCityPractice"

    buildType(HelloWorldBuild)
})

object HelloWorldBuild : BuildType({
    name = "Hello World Build"

    steps {
        script {
            name = "Print Hello World"
            scriptContent = """echo "hello world""""
        }
    }
})

