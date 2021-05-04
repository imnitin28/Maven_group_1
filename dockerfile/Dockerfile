ARG VERSION=3.8.1-openjdk-17-slim

FROM maven:${VERSION}

WORKDIR /usr/src/app

COPY pom.xml ./
ADD 

RUN mvn test

CMD ["test"]
