package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object Build : BuildType({
    name = "Build"

    vcs {
        root(HttpsGithubComDavGal42teamCityPracticeGitRefsHeadsMain)
    }
steps {
    script {
        id = "simpleRunner"
        scriptContent = """echo "hello world""""
    }
}
    triggers {
        vcs {
        }
    }

    features {
        perfmon {
        }
    }
})
