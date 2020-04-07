#### Sample Project for Spring Boot Sonarqube Quality Measurement

## Perquisites

 - Maven 3.x or higher version
 - Java 11

## Bootstrap Servers
`docker-compose -f .build/docker-compose.yml up -d`

## Close Down Servers
`docker-compose -f .build/docker-compose.yml down`

docker-compose.yml file is references from this source: https://gist.github.com/Warchant/0d0f0104fe7adf3b310937d2db67b512

## Run tests with sonar report
`mvn clean install sonar:sonar`