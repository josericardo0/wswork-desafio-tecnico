
FROM openjdk:17-oracle

LABEL maintainer="gmnaarea@gmail.com"

WORKDIR /app

COPY /wait-for-it.sh /wait-for-it.sh
RUN chmod +x /wait-for-it.sh

COPY build/libs/projeto-0.0.1-SNAPSHOT.jar /app/projeto-0.0.1-SNAPSHOT

ENTRYPOINT ["/wait-for-it.sh", "postgres-db:5432", "-t", "60", "--", "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/projeto-0.0.1-SNAPSHOT"]