# Config Client Application

Spring Boot application to verify the correct deployment of a Spring Cloud Config Server.

This application has an http endpoint at the root of the context which will output the value of the config property `application.info`. Depending on how you start this application will determine which config is used to populate this value.

## Prerequisites
You must first start the Config Server application. 

## Running this application
You can start this application using `mvn spring-boot:run` or build the application first using `mvn package` and then start using
`java -jar config_client.jar` 
Once started you can verify it is running correctly by using `curl localhost:9000` and the output should be `application.info set to 'default : App 2'`

## Application Names
`application.yml` defines the application name for this application. There are 2 values configured. "app1" and "app2". Comment these in and out to change the application name.

## Spring Profiles
There are a number of different profiles defined in `application.yml`.
You specify a profile when starting the server using `-Dspring.profiles.active=<profile>`. The following profiles are available along with the ports they run on 

* default (no profile required on start) - 9000
* dev - 9001
* local - 9002
* uat - 9003
* preprod - 9004
* prod - 9005

## Config Combinations

The following table shows examples of the combinations and expected output
`| -------- | ------- | ----------------------------------------- |`
`| App Name | Profile | Expected output                           |`
`| -------- | ------- | ----------------------------------------- |`
`| app1     | default | application.info set to 'default : App 1' |`
`| app2     | default | application.info set to 'default : App 2' |`
`| app1     | uat     | application.info set to 'uat : App 1'     |`
`| app2     | uat     | application.info set to 'uat : App 2'     |`
`| -------- | ------- | ----------------------------------------- |`
