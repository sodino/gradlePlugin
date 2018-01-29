package gradle.calc.task.time

import org.gradle.api.Plugin
import org.gradle.api.Project

public class CalcTaskTime implements Plugin<Project> {

    @Override
    void apply(Project project) {
        def listener = new TimeListener()
        project.gradle.addBuildListener(listener)
        project.gradle.addListener(listener)
    }
}