# Samples

This repository contains miscellaneous samples.

* json - Samples showing how to ingest JSON messages
    * Gson - JSON samples using Google's GSON library
    * Jackson - JSON samples using FasterXML's Jackson library

## Running samples

* Run the Gson Sample
```bash
cd ~/git/Samples/json/run
CP=$(find libs -name '*.jar' -printf '%h/%f:')
java -cp ${CP} net.ourpts.json.gson.GsonSample
```
