# proguard-keep-annotation

Usage
----
 `$ gradle clean jar exportLibs obfuscate run`

Output
----

```
:clean
:compileJava
:processResources NO-SOURCE
:classes
:jar
:obfuscate
:run
Class name: com.github.benji.proguard.TheAnnotatedClass
Annotation found: org.springframework.stereotype.Service

BUILD SUCCESSFUL

Total time: 1.575 secs
```
