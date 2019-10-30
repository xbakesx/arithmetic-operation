# Getting Started

## What To Do

Fork this repository and update it with code to satisfy the following criteria:

 * ArithmeticApplication should run and take three arguments from the command line an operation (one of +, -, and *) and then two numbers and prints out the result of using that operation on those two numbers in that order
 * All of the tests in ArithmeticApplicationTests pass
 
Feel free to:

 * Add tests we don't have covered.
 * Better error handling.
 * Explain in comments what you were doing / thinking, especially if you know you haven't gotten it exactly right.
 
## Submission Process

 * I don't honestly know...
 
## What We're Looking For

 * Proper use of abstraction
 * Good coding practices
 * Identifying edge cases
 * Test coverage 
 * Use correct indentation and curly braces ;-)
 
## Unfamiliar with Spring Boot and Gradle?

If your computer has a jdk and jre (11) installed you should be able to do the following from the root of the project:

### Run the Tests

```bash
> ./gradlew test
```

### Compile and Run the Application

```bash
> ./gradlew clean assemble
> java jar build/libs/arithmetic-0.0.1-SNAPSHOT.jar <arguments>
```
