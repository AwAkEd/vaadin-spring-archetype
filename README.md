Maven Archetype for a Simple Vaadin+Spring project.
===================================================

Based on the initial work started at [http://vaadin.com/es/wiki/-/wiki/Main/Spring%20Integration] (http://vaadin.com/es/wiki/-/wiki/Main/Spring%20Integration).

You can see the code at [http://dev.vaadin.com/browser/incubator/SpringApplication] (http://dev.vaadin.com/browser/incubator/SpringApplication)

To generate a new project using the archetype just follow this steps:

  * Download the jar file from the [http://code.google.com/p/vaadin-spring-archetype/downloads/list] (http://code.google.com/p/vaadin-spring-archetype/downloads/list) page.

  * Deploy the archetype on local repository by typing:

```
mvn install:install-file                            \
   -Dfile=vaadin-spring-archetype-1.2-SNAPSHOT.jar  \
   -DgroupId=com.vaadin                             \
   -DartifactId=vaadin-spring-archetype             \
   -Dversion=1.2-SNAPSHOT                           \
   -Dpackaging=jar                                  \
   -DgeneratePom=true
```

  * Generate the project by typing:

```
mvn archetype:generate                            \
  -DarchetypeGroupId=com.vaadin                   \
  -DarchetypeArtifactId=vaadin-spring-archetype   \
  -DarchetypeVersion=1.2-SNAPSHOT                 \
  -DgroupId=com.mycompany                         \
  -DartifactId=myApplication                      \
  -Dversion=0.1-SNAPSHOT
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
