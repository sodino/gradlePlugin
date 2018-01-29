package gradle.hello

import org.gradle.api.Plugin
import org.gradle.api.Project
import gradle.hello.bean.Hello
import gradle.hello.bean.IDE

public class HelloGradle implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create("hello", Hello)
        project.extensions.create("IDE", IDE)

        project.task('gradle.hello.world') << {
            def hello = project['hello']
            def IDE = project['IDE']

            println """Hello ${hello.name}. 
Demo from ${IDE.name}[${IDE.versionName}($IDE.versionCode)]"""
        }
    }
}