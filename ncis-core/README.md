# Introduction 
Core library with generic infrastructure code used by different cloud native components.
Allows you to enable different functionalities depending on what enable annotation you use. 
Current core library features are cloud storage and messaging functionality.

## Cloud Storage

Enable this functionality with `@EnableCoreCloudStorage` on a configuration class.

Configuration to use the default cloud storage.
Won't need a qualifier when requesting a `CloudStorageService` bean.
Since version 2.3.0 the `StringToObjectParser` has been deprecated in favor of the new `StreamObjectParser`.
All services do provide new streaming methods.

Properties:
```
cloud-storage.account-name=
cloud-storage.key=
cloud-storage.connection-string=
cloud-storage.container-name=
```

Multiple cloud storage configurations.
You need a qualifier when requesting a `CloudStorageService` bean.
The qualifier is as follows `cloudStorageService-{CONTAINER ID}`.

Properties:
```
cloud-storage.connection-strings.{CONNECTION ID}.account-name=
cloud-storage.connection-strings.{CONNECTION ID}.key=
cloud-storage.connection-strings.{CONNECTION ID}.connection-string=

cloud-storage.container-names.{CONTAINER ID}.connection-string-id={CONNECTION ID}
cloud-storage.container-names.{CONTAINER ID}.container-name=
```

### Distributed tracing
When sending messages with the `ObjectTransmitter` or `RabbitMqPublisher` metadata will be set as headers on the AMQP message.
The metadata consist of a correlation id and first seen value.
Using the `ObjectProcessor` will automaticly detect the metadata and stores them into a `ThreadLocal` instance.
Using `ObjectTransmitter` or `RabbitMqPublisher` will lookup the `ThreadLocal` for metadata to set the headers on AMQP message.
This *only works* if sending messages are done *in the same thread* as the received message.
Accessing the stored metadata can be done with the `MessageMetadataHolder` in the same thread.
Note: since version 2.4.0
