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







Each project has its own pom file. You can configure Maven to build one project or multiple projects. 
The  pom file in the root of the directory lists the individual projects in a modules section that should built

Maven Tutorial: [https://www.vogella.com/tutorials/ApacheMaven/article.html](https://www.vogella.com/tutorials/ApacheMaven/article.html)
