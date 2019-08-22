#!/bin/bash
set -euo pipefail

# wipe local directory (will be populated from Docker image)
sudo rm -Rf $(pwd)/target/liberty/wlp/*

# running the usual container image, with the Docker volume location
docker run --rm \
  --name coffee-shop \
  -p 9080:9080 \
  -v liberty_dev_vol:/opt/ol/wlp/ \
  coffee-shop
