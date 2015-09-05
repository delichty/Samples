# JSON / GSON Sample

This sample shows how to ingest JSON messages using Google's GSON library.

## Building

* First, build the Common JAR

```bash
cd ~/git/Samples/json/Common
gradle publish
```

* Next, build the JSON/GSON JAR

```bash
cd ~/git/Samples/json/Gson
gradles
```

## Running

```bash
cd ~/git/Samples/json/Gson/run
CP=$(find libs -name '*.jar' -printf '%h/%f:')
java -cp ${CP} net.ourpts.json.gson.GsonSample
```
