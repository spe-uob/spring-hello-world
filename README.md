# Run

## Native

`mvn spring-boot:run`

## Docker
Build jar
`mvn package`
Build image
`docker build --build-arg JAR_FILE=target/live-demo-0.0.1-SNAPSHOT.jar -t dschien/spring-hello-world .`
Run container
`docker run -p 8080:8080 dschien/spring-hello-world` 


