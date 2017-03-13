# kotlin-docker

### How to build

* Latest stable JDK 8
* Install docker properly

### QuickStart

```
# clone the source code
git clone git@github.com:Alwayswithme/kotlin-docker.git
# change directory
cd kotlin-docker
# use the gradle script to build a docker image
./gradlew build buildDocker
```

It may take a while for gradle and docker to download some file.
After finish, you can find the image by type `docker image ls`

```
# my image is call phoenixyip/kotlin-docker
REPOSITORY                   TAG                 IMAGE ID            CREATED             SIZE
phoenixyip/kotlin-docker     latest              ad5220f13021        22 minutes ago      230 MB
```

### Run
```
docker run -p 8080:8080 -t phoenixyip/kotlin-docker
```

### Stop
find out the **CONTAINER ID** by `docker ps`
```
docker stop ~CONTAINER ID~
```