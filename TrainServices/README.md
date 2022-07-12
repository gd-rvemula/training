### What is this repository for? ###

* Contents of this repository are intended to provide new developer training sessions


### How do I get set up? ###

* Follow the day to day agenda below

### Contribution guidelines ###

* Create a new branch with your suggestions/recommendations
* Create a pull request

### What if I can't access youtube or other links here? ####
* You can login to this site using your mobile phone
* You should be able to watch videos and tutorials from your mobile
* If you don't have a device that you can use to access youtube, stop here and consider career change. 

### $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
###  General Training Plan  for all Developers
### $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

#### Day1: 

* Read and learn about Git
* Reading on git, git shortcuts, git commands to clone, branch, merge, commit
* Setup git bash
* Setup intelliJ
* Read and learn about how to use gitlab(which will be used for these training exercises)
* Generate ssh key
* add your ssh public key to gitlab
* A good tutorial on different features of Git. Its only 10 mins video. 
But, a must watch for all developers to understand how to work in multiple branches. If you are new to git and have used SVN, its a must watch.
https://www.youtube.com/watch?v=G7kJRkUaVHQ

How to create SSH key?
a) Generate ssh key using putty
https://docs.joyent.com/public-cloud/getting-started/ssh-keys/generating-an-ssh-key-manually/manually-generating-your-ssh-key-in-windows

b) Or use git bash
ssh-keygen -b 1024 -t rsa -f id_rsa -P ""



#### Day2:
AM: Watch some videos on Confluence, Jira and Bitbucket

* Confluence introduction 
https://youtu.be/09CuRQoJzB8

* Jira introduction 
https://youtu.be/8KPoZ5g8NqU
https://www.youtube.com/watch?v=sGdVEbHTI1A

* Working with Jira and confluence 
https://www.youtube.com/watch?v=bQdwy2x2eRo

* Working with Jira and bitbucket 
https://www.youtube.com/watch?v=M-u8-Ga6if0

PM:

* Create a feature branch in gitlab and do the change, commit code
* Run the test project
* Postman- watch videos
https://www.youtube.com/playlist?list=PLM-7VG-sgbtD8qBnGeQM5nvlpqB_ktaLZ
* SOAPUI
https://www.youtube.com/watch?v=XV7WW0bDy9c&t=11s

### $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
###  Training Plan  for Java Developers
### $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

#### Day3: Code quality 

* Learn about checkstyle vs pmd vs findbug. Google for these tools and read a few articles.
http://continuousdev.com/2015/08/checkstyle-vs-pmd-vs-findbugs/
* Create a new branch called yourname/pmddemo. Branch from pmdDemo
* Checkout yourname/pmdDemo branch and perform "mvn clean install". 
* Fix the build errors shown by pmd in /target/pmd.xml. 
* Commit your changes.
* checkout pmdCleanedUp to compare your solution against. 
* Repeat the same process for findbug and checkstyle from respective branches 



#### Day 4-5 : 
##### AM: Read and watch:
* Learn about junit and Writing junits
* Mockito and mocking database calls and service calls
* Code coverage checks with jacoco

##### PM:
* Create a new branch called yourname/junit. Branch from junit
* Checkout yourname/junit branch and perform "mvn clean install". 
* Build will fail as code coverage checks have not been met. 
* Write unit tests for missing classes and ensure build succeeds.
* Commit your changes to yourname/junit


#### Day 6:

##### AM: Read and watch
* Apache Cassandra
* Working with Cassandra
* CQL
* Using DAO and accessor classes
* Read and write to Cassandra table
* Create a table and read/write to table from service.


#### Day 7:

##### Read, watch and Learn
* Jenkins 
* Rundeck
* Sonar
* Context and dependency injection: https://dzone.com/articles/cdi-di-p1

Day 8
* Liberty container
* Running RESTful service inside Liberty container

### $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
###  Training Plan  for UI Developers
### $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$




#### Day 3

* Clean code concepts for javascript: Read this manual once or twice or more - https://github.com/ryanmcdermott/clean-code-javascript
* Grunt Setup / Node Setup / Yo Generator set up / bower setup
* Creating a project from yo generator
* Understanding Project folder 
* Understanding gruntFile.js (Task creation)
* Understanding package.json and bower.json

#### Day 4

* Understanding of Angular Bootstrap for UI layout.
* Creating a html template page.
* Creating a controller with Jasmine and Karma Test Case.
* Understanding eslint Rules, code style.
* Introduction of CSS/Stylesheet to html pages.

#### Day 5

* Create a Service (With test Cases)
* Understanding routing techniques UI Router (routeProvider / Stateproviders )
* Create a Output Page (Redirects to this page from menu page using routing techniques)
* Create a directive (A, E, C and M Type) with Test Cases .

#### Day 6

* Understanding of JSON
* Create a filter , use ng-repeat and show data on screen in Table
* Calling Http service , promise and $q services .
* Setting up Proxies in gruntfile.js.

#### Day 7

* Angular style guide - https://github.com/johnpapa/angular-styleguide
* 

### $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
###  Still thirsty for skills?
### $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

* A guide to learn bash - reivew and try the commands in a bash environment
https://github.com/Idnan/bash-guide

*
