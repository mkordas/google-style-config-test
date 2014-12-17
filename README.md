[![][travis img]][travis]

This project is used to check correctness of Checkstyle google_checks.xml configuration. This project is divided into two parts. The first part is placed it main folder and contains input files for JUnit tests which is placed in the second part of the project. 

The project is consists of packages. One package is refers to one rule from the Google Java Style Guide(http://google-styleguide.googlecode.com/svn/trunk/javaguide.html). One test is refers to one Check which is used in google_checks.xml from checkstyle repository. 

'mvn clean test' - to run all tests.

Structure:

Test inputs - src/main/java/com/google/checkstyle/test

JUnit tests - src/test/java/com/google/checkstyle/test

Detailed reports for each rule from Google's Java Style Guide:

http://checkstyle.sourceforge.net/google_style.html

[travis]:https://travis-ci.org/checkstyle/google-style-config-test
[travis img]:https://travis-ci.org/checkstyle/google-style-config-test.svg?branch=master
