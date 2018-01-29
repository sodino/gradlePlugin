package gradle.hello

import org.gradle.api.Plugin
import org.gradle.api.Project

public class PluginImpl implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('gradle.hello.world') << {
            println "Hello gradle plugin"
        }
    }
}