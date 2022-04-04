# Introduction

This is the parent project of the NDW OCPI Receiver tool, which includes various internal libraries and tools for the
which are required by the project.

For an overview of the NDW OCPI Receiver tool, see the [ncis-ci-o-cecs](/ncis-ci-o-cecs) project.

# OCPI

The application is built based on one interpretation of OCPI. There is a possibility that other interpretations exist,
which may also require adjustments to the current codebase.

**Note: The current interpretation of OCPI is outdated.**

# Installation

Run ``mvn clean install`` in the following order:

- DatexII
- OCPI
- ncis-core
- ncis-integration-test-util

# Build

Before building the [receiver component](/ncis-ci-o-cecs), be sure to set the required application properties (can be
found in the project's readme).

# Tests

Run ``mvn verify`` to run unit & integration tests.
