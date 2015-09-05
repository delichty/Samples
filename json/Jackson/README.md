# JSON / Jackson Sample

This sample shows how to ingest JSON messages using FasterXML's Jackson library.

## Building

* First, build the Common JAR

```bash
cd ~/git/Samples/json/Common
gradle publish
```

* Next, build the JSON/Jackson JAR

```bash
cd ~/git/Samples/json/Jackson
gradle
```

## Running

```bash
cd ~/git/Samples/json/Jackson/run
CP=$(find libs -name '*.jar' -printf '%h/%f:')
java -cp ${CP} net.ourpts.json.jackson.JacksonSample
```
