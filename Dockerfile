FROM maven

# Create app directory
WORKDIR /usr/src/app

COPY pom.xml ./

RUN mvn test

CMD ["test"]