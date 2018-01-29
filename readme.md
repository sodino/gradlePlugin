[TOC]

# gradle plugin demo
## gradleHelloWorld
练习gradle plugin Module的搭建、发布、参数传递、日志打印。
根据配置打印出指定日志
```
hello {
    name "gradle plugin"
    IDE {
        name "AndroidStudio"
        versionName "3.0.1"
        versionCode 301
    }
}
```
打印出：
```
Hello gradle plugin.
Demo from AndroidStudio[3.0.1(301)]
```

## gradleCalcTaskTime
打印各个`task`的耗时
示例如下：
```
BUILD SUCCESSFUL in 11s
30 actionable tasks: 23 executed, 7 up-to-date
Task spent time (start:20180129 21:38:00.464 ~ end:20180129 21:38:10.201) :
      9ms :clean
    386ms :app:clean
      1ms :gradleCalcTaskTime:clean
      2ms :gradleHelloWorld:clean
      0ms :app:preBuild
    194ms :app:preDebugBuild
     76ms :app:compileDebugAidl
      8ms :app:compileDebugRenderscript
      2ms :app:checkDebugManifest
     17ms :app:generateDebugBuildConfig
      5ms :app:prepareLintJar
      5ms :app:generateDebugResValues
      1ms :app:generateDebugResources
   2484ms :app:mergeDebugResources
      9ms :app:createDebugCompatibleScreenManifests
    191ms :app:processDebugManifest
      8ms :app:splitsDiscoveryTaskDebug
   1571ms :app:processDebugResources
      1ms :app:generateDebugSources
     63ms :app:javaPreCompileDebug
    988ms :app:compileDebugJavaWithJavac
      3ms :app:compileDebugNdk
      1ms :app:compileDebugSources
      8ms :app:mergeDebugShaders
      4ms :app:compileDebugShaders
      0ms :app:generateDebugAssets
     30ms :app:mergeDebugAssets
    714ms :app:transformClassesWithDexBuilderForDebug
    887ms :app:transformDexArchiveWithExternalLibsDexMergerForDebug
    215ms :app:transformDexArchiveWithDexMergerForDebug
     11ms :app:mergeDebugJniLibFolders
    450ms :app:transformNativeLibsWithMergeJniLibsForDebug
     15ms :app:transformNativeLibsWithStripDebugSymbolForDebug
      1ms :app:processDebugJavaRes
    304ms :app:transformResourcesWithMergeJavaResForDebug
      3ms :app:validateSigningDebug
    963ms :app:packageDebug
      1ms :app:assembleDebug

```