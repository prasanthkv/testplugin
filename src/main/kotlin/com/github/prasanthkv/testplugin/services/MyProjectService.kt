package com.github.prasanthkv.testplugin.services

import com.intellij.openapi.project.Project
import com.github.prasanthkv.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
