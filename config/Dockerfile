FROM java:8u92-jre-alpine
MAINTAINER Alexey Zhytnik <alexeyzhytnik@gmail.com>

ADD ./target/config.jar /app/
CMD ["java", "-jar", "/app/config.jar"]

EXPOSE 8888