#!/usr/bin/env bash

docker kill local-postgres
docker rm local-postgres

docker run -d -p 5432:5432 --name local-postgres -e POSTGRES_PASSWORD=postgres -d postgres