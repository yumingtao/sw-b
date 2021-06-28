# Introduction
It is only used for []()

# Getting Started
## Build
1. build the project, ```gradle build```

## Build&Push docker image
2. build docker image, run ```docker build . --no-cache --rm -t [url]/test/sw-b```
3. push the image to docker hub/acr, run ```docker push [url]/test/sw-b```

# Test local
1. run ```mvn springboot:run```
2. Input "http://localhost:8181/swb/api/v1/hello/xxxxx"

