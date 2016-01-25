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

or if your repository already exists, have the directory name be the same name of the project you want to generate
then navigate to the parent folder of the repo, then execute the `mvn archetype:generate` listed above.
This will insert all the required elements into your working repo.

You will need to adjust the pom.xml to add some global properties:

add the following to the <dependencies> node:

        <dependency>
            <!-- this include JUnit and JAssert -->
            <groupId>io.dropwizard</groupId>
            <artifactId>dropwizard-testing</artifactId>
            <version>${dropwizard.version}</version>
        </dependency>
        
Also, the archetype uses the wrong structure for the maven-site-plugin. 
Replace with the following:

        <project>
            <build>
                <plugins>
                    
                    <plugin>
                        <artifactId>maven-site-plugin</artifactId>
                        <version>3.4</version>
                    </plugin>
                    
                </plugins>
            </build>
            
            
        </project>
        
        
then add the following:

        <project>
            <reporting>
                <plugins>
                  <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-project-info-reports-plugin</artifactId>
                    <version>2.6</version>
                  </plugin>
                </plugins>
              </reporting>
        </project>
