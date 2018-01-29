package gradle.calc.task.time

import org.gradle.BuildListener
import org.gradle.BuildResult
import org.gradle.api.Task
import org.gradle.api.execution.TaskExecutionListener
import org.gradle.api.initialization.Settings
import org.gradle.api.invocation.Gradle
import org.gradle.api.tasks.TaskState
import org.gradle.internal.time.Clock

public class TimeListener implements TaskExecutionListener, BuildListener {
    public static final String FORMAT = 'yyyyMMdd HH:mm:ss.SSS'
    private Clock clock
    private times = []
    private String dateStart
    @Override
    void buildStarted(Gradle gradle) {
        // buildStarted在addListener之前执行，本处无法被调用到
    }

    @Override
    void settingsEvaluated(Settings settings) {

    }

    @Override
    void projectsLoaded(Gradle gradle) {

    }

    @Override
    void projectsEvaluated(Gradle gradle) {

    }

    @Override
    void buildFinished(BuildResult buildResult) {
        println "Task spent time (start:$dateStart ~ end:${new Date().format(FORMAT)}) :"
        for (time in times){
            printf "%7sms %s\n", time
        }
    }

    @Override
    void beforeExecute(Task task) {
        clock = new Clock()
        if (dateStart == null) {
            println ":CalcTaskTime:first execute task:${task.path}"
            dateStart = new Date().format(FORMAT)
        }
    }

    @Override
    void afterExecute(Task task, TaskState taskState) {
        def ms = clock.elapsedMillis
        times.add([ms, task.path])
//        task.project.logger.warn "${task.path} spent ${ms}ms"
    }
}