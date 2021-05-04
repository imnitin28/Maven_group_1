ARG VERSION=3.8.1-openjdk-17-slim

FROM maven:${VERSION}

WORKDIR /usr/src/app

#COPY pom.xml ./
#ADD https://github.com/imnitin28/Maven_group_1/blob/main/pom.xml ./
ADD pom.xml ./

RUN mvn test

#where can I see this volume?
VOLUME /myvolume

CMD ["test"]
