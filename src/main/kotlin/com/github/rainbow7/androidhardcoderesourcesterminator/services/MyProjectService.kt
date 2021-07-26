package com.github.rainbow7.androidhardcoderesourcesterminator.services

import com.github.rainbow7.androidhardcoderesourcesterminator.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
