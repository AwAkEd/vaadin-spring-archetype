Maven Archetype for a Simple Vaadin+Spring project.
===================================================

Based on the initial work started at [http://vaadin.com/es/wiki/-/wiki/Main/Spring%20Integration] (http://vaadin.com/es/wiki/-/wiki/Main/Spring%20Integration).

You can see the code at [http://dev.vaadin.com/browser/incubator/SpringApplication] (http://dev.vaadin.com/browser/incubator/SpringApplication)

## Introduction

To use the archetype you should Download the last version [vaadin-spring-archetype-1.2-SNAPSHOT.jar] (http://vaadin-spring-archetype.googlecode.com/files/vaadin-spring-archetype-1.2-SNAPSHOT.jar).

In future I hope this artifact will be deployed on a maven repository and anyone can use it without this previous step.

## Installation 

After you download the file you should open a new Terminal window and type in it:

```
mvn install:install-file                              \
   -Dfile=vaadin-spring-archetype-1.2.1-SNAPSHOT.jar  \
   -DgroupId=com.vaadin                               \
   -DartifactId=vaadin-spring-archetype               \
   -Dversion=1.2.1-SNAPSHOT                           \
   -Dpackaging=jar                                    \
   -DgeneratePom=true
```

This maven command shows the following output:

```
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-install-plugin:2.3.1:install-file (default-cli) @ standalone-pom ---
[INFO] Installing .../vaadin-spring-archetype-1.2.1-SNAPSHOT.jar to .../.m2/repository/com/vaadin/vaadin-spring-archetype/1.2.1-SNAPSHOT/vaadin-spring-archetype-1.2.1-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.758s
[INFO] Finished at: Thu May 12 08:25:53 CEST 2011
[INFO] Final Memory: 3M/81M
[INFO] ------------------------------------------------------------------------
```

If the output is like the shown above, the artifact is just installed in your local repository and you can continue with the steps shown at [Create a project] (https://github.com/AwAkEd/vaadin-spring-archetype/edit/master/README.md#create-a-project).

## Create a project

To generate a new project using the archetype just follow this steps:

  * Open a new terminal and go to the folder where you want to create the new project.

  * Generate the project by typing:

```
mvn archetype:generate                              \
  -DarchetypeGroupId=com.vaadin                     \
  -DarchetypeArtifactId=vaadin-spring-archetype     \
  -DarchetypeVersion=1.2.1-SNAPSHOT                 \
  -DgroupId=com.mycompany                           \
  -DartifactId=myApplication                        \
  -Dversion=0.1-SNAPSHOT
```

  * To start working with the recently created project go to _myApplication_ folder in a terminal and type:

```
mvn clean install
```

The base project generated includes a _tomcat_ server to test the recently generated project. 

To test it simply run:

```
mvn clean install tomcat:run
```

And access to the Application by typing

```
http://localhost:8080/myApplication
```

on your favorite browser.

## Copyright and license

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this work except in compliance with the License.
You may obtain a copy of the License in the LICENSE file, or at:

  [http://www.apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
