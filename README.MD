export SPRING_PROFILES_ACTIVE=NotSet
./gradlew bootRun
# port and properties from application.properties not loaded?
tp://localhost:9090/actuator/env | jq . | grep  -B 2 -A 2 application


# see if application.properties is loaded 

export SPRING_PROFILES_ACTIVE=dev
# sets to 7070
./gradlew bootRun
curl http://localhost:7070/actuator/env | jq . | grep  -B 2 -A 2 application
# see if the port changes to 7070 and the application properties loaded 

export SPRING_PROFILES_ACTIVE=qa
./gradlew bootRun
# only port should change see if the application name is loaded as default from application.properies
