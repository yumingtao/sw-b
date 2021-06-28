#!/bin/sh
export JAVA_APP_DIR=/deployments
export JAVA_APP_NAME=lea
export JAVA_MIN_MEM_RATIO=50
export JAVA_MAX_MEM_RATIO=70
export SW_AGENT_NAME=swb1
export JAVA_OPTIONS="${SKYWALKING_AGENT} -Djava.security.egd=file:/dev/./urandom"
cd $JAVA_APP_DIR
./run-java.sh