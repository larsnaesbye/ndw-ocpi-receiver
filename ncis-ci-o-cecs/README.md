# Introduction

This application is intended to pull, validate and map ocpi to DatexII.

The data is uploaded to an Azure Blob Storage. References to these blobs will be published to RabbitMQ for further
processing.

# Build and Test

## Build

This project uses Maven as build tool.

## Test

The application has both unit tests and integration tests supplied. For newly added code, please provide unit tests and
integration tests (if necessary) as well.

### Integration tests

The integration test setup uses [Testcontainers](https://www.testcontainers.org) for managing Docker instances of
[Azurite](https://github.com/Azure/Azurite) and [RabbitMQ](https://www.rabbitmq.com/) for usage with integration tests.

The [ncis-integration-test-util](../ncis-integration-test-util) dependency provides a
TestContainerSupplier class, which supplies Testcontainer instances for both Azurite and RabbitMQ. Since there is no
official Testcontainer module for Azurite, a custom AzuriteContainer class has been implemented and is provided by the
test utility as well.

## Configuration

Configurable properties are listed below:

### Azure Blob Storage

|Property|Description|
|:------:|:----------|
|`cloud-storage.account-name`| The name of the Azure Storage account.
|`cloud-storage.key`| The authentication key to authorize the application for accessing the Azure Storage Account.
|`cloud-storage.connection-string`| The connection string used for connecting to the Azure Storage Account.
|`cloud-storage.container-name`| The name of the Azure Blob Container to read/write data.
|`cecs.table.directory`| The directory for storing table messages.
|`cecs.status.directory`| The directory for storing status messages.

### Spring AMQP

|Property|Description|
|:------:|:----------|
|`spring.rabbitmq.host`| The RabbitMQ host.
|`spring.rabbitmq.username`| The username of the RabbitMQ user.
|`spring.rabbitmq.password`| The password of the RabbitMQ user.
|`spring.rabbitmq.virtual-host`| The RabbitMQ virtual host to connect to.
|`spring.rabbitmq.template.exchange`| The RabbitMQ exchange for this component.
|`cecs.table.routing-key`| Topic to push newly received and mapped tables to
|`cecs.status.routing-key`| Topic to push newly received and mapped statuses to

### NCIS-CORE

|Property|Description|
|:------:|-----------|
|`file.directory`| The file directory used by blob storage

### Custom properties

|Property|Description|
|:------:|:----------|
|`api.base-url`| the baseurl for fetching new OCPI data
|`api.page-size`| the page size for fetching OCPI data
|`api.locations-path`| the path to fetch OCPI locations from
|`api.tariffs-path`| the path to fetch OCPI tariffs from
|`scheduling.enabled`| boolean to enable or disable scheduling of data poller
|`scheduling.cron-schedule`| cron string used to trigger data poller

# The received and mapped data

## Dynamic

Dynamic data is mapped from both OCPI tariffs & OCPI locations and represents data dat is prone to changes.

## Static

Static data is mapped from OCPI locations is represents data that is less prone to changes

## OcpiDataAnalyzer

To ensure we get all required fields from our OCPI input we validate the incoming data via the data analyzer on missing
required properties. This was done because we want to have non-blocking validation for incoming data which we can log
and later analyze te see how often we receive incomplete data. The receiver should not stop when encountering missing
required properties.





