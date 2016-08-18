FROM java:8u92-jre-alpine
MAINTAINER Alexey Zhytnik <alexeyzhytnik@gmail.com>

ADD ./target/notes.jar /app/
CMD ["java", "-jar", "/app/notes.jar"]

EXPOSE 8000