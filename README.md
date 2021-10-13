# templatemvn


# Maven

#### What is Apache Maven?
Apache Maven is an powerful build tool for Java projects.
Build tools perform the compilation, testing, packaging and deployment of the final product.
The advantages of performing these steps automatically instead of a human performing these steps is that the build is reproducible, faster and less error prone.


#### Pom Files

By default, the configuration of a Maven project is done via at least one pom.xml configuration file.

Maven uses a declarative style of describing the build, i.e., you describe what should be build not how it is build. This allows Maven to use default for performing the build steps.

The pom file defines:

- project names and versions
- properties relevant for build configuration (e.g. the Java Version)
- dependencies

_Project Pom File with project details, properties, and dependencies:_

![image](https://user-images.githubusercontent.com/24531486/137179518-e62b2b5e-8bea-466d-8eae-a4990831d3e3.png)





Each project has its own pom file. You can configure Maven to build one project or multiple projects. 
The  pom file in the root of the directory lists the individual projects in a modules section that should built

_Root Pom File with projects (modules) to build:_

![image](https://user-images.githubusercontent.com/24531486/137179883-dfd06306-a43d-4cdf-b3ac-d0e7c5ac26aa.png)



Maven Tutorial: [https://www.vogella.com/tutorials/ApacheMaven/article.html](https://www.vogella.com/tutorials/ApacheMaven/article.html)
