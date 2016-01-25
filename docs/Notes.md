# Why [DropWizard](http://dropwizard.github.io/dropwizard/0.9.1/docs/index.html)


Dropwizard combines Jetty, Jersey, Jackson, and other stable, mature libraries to provide a phenomenal platform for developing RESTful web applications.

Dropwizard makes it very simple to create an application ready for production that’s capable of doing 30,000-50,000 requests per second. 


use the following maven archetype to auto generate the project shell:

    `
    mvn archetype:generate -DarchetypeGroupId=io.dropwizard.archetypes -DarchetypeArtifactId=java-simple -DarchetypeVersion=0.9.1
    
        groupId:  com.burson
        artifactId: poker
        name: Poker
    
    cd poker
    git init
    git add origin https://github.com/kburson/poker.git
    git fetch --all
    git checkout -t origin/master
    `
    
