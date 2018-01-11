# lab_TRPO

The JSON Validation Service (JVS) is a validator that allows every users to check JSON objects for compliance with the JSON grammar.

Run:
./gradlew docker && docker run -t --rm -p 80:80 validation-server

curl -s --data-binary @filename.json http://localhost:80
