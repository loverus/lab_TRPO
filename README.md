# lab_TRPO

The JSON Validation Service (JVS) is a validator that allows every users to check JSON objects for compliance with the JSON grammar.

Create image with Gradle:
./gradlew crdockerimage 

Run:
docker run -d -p 80:80 github.com/loverus/lab_TRPO.git

Send file to validation: 
curl -s --data-binary @filename.json http://localhost
