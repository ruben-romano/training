# Bootcamp lab6

## Objective
A "Hello World" for a simple GET REST API, using Spring Boot.

This lab doesn't use Hazelcast directly. It shows the smallest possible REST service,
which is a good starting point for exposing Hazelcast data over HTTP.

## Step 1 - build
From the `bootcamp` directory, build as usual. Maven builds an executable Jar, so you need
to run as far as the _package_ phase.

```
mvn install
```

## Step 2 - run the server
Either run `SpringBootServer` from your IDE, or from the command line:

```
java -jar labs/lab6/lab6-server/target/bootcamp-lab6-server.jar
```

The server listens on port 8080. Change `server.port` in `application.yml` if this is in use.

## Step 3 - call the API
`HelloController` has two GET endpoints. Try them with curl or a browser.

```
curl http://localhost:8080/hello
Hello, World!

curl http://localhost:8080/hello/Hazelcast
Hello, Hazelcast!
```

## Step 4 - extend it
Add another `@GetMapping` method to `HelloController`, perhaps one that takes a
request parameter (`@RequestParam`), or returns a JSON object instead of plain text.
