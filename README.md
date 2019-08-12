# Million Random Numbers

Standalone application that generates a million positive random numbers in the range 0 - 1,000,000 with repetition.

###### Specifications

This project was created using the following tools:
- Java 8
- Junit
- Maven
- JavaDoc

###### Requeriments

- JDK 8 or higher
- Apache Maven 

###### Build and start 

1. Clone or download the repository from the following url: https://github.com/ZhectorSM/MillionNumbers.git
2. Unzip the project (Just in case you chose the zip version)
3. From a terminal or cmd 
	- Go to the root folder of the project: /MillionNumbers  or /MillionNumbers-master(zip version)
	- Execute the commands:  
         - mvn clean package
         - cd target
	- Finally execute: java -jar MillionRandom-1.0.jar

###### Intructions

1. Type the name of the Original random file
2. Type the name of the Sorted file
3. Good job! You have generated and sorted a Million Random Numbers.
4. The files generated are in the target folder of the project

###### Assumptions

- The numbers generated are positive and Integer numbers
- The range of random numbers is from 0 - 1,000,000 with repetition
- The sorting method is Ascending order
- The output files are in format csv
- The name of the output files are provided for the user
- The return of line ("\n") was added for visualization purposes

###### Notes

- The JavaDoc documentation of the application is in the path /doc/apidocs/index.html
- The unit tests are in the path src/test/java

