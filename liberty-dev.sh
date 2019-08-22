#!/bin/bash
set -euo pipefail

sudo chmod -R 777 target/liberty/wlp

mvn liberty:dev -DskipServer
