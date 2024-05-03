# CucumberOnline3x_March24
Java, Cucumber, Gherkin, TestNG, Maven, GitHub and Jenkins

# TOOLS Required
- GitHub account
- Git
- Java 17 or up
- Cucumber (selenium)
- Maven
- IDE: IntelliJ Community Edition

# List of dependencies we need from https://mvnrepository.com/ and (keep this inside pom.xml file)
- selenium-java
- cucumber-testng
- cucumber-java
- cucumber-testng
- javafaker (fake test data)

# Plugins in IntelliJ
- Cucumber for Java
- Gherkin

# How to create a new framework from scratch 
- Go to GitHub and create a new repo/project
- Clone project into your local
- Open IDE (IntelliJ) -- map it 


# How to run the test in CLI 
- mvn verify -Denv=stage -Dbrowser=firefox
- mvn verify -Denv=qa -Dbrowser=chrome -Dcucumber.filter.tags=@hb