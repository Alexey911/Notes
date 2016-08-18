FROM java:8u92-jre-alpine
MAINTAINER Alexey Zhytnik <alexeyzhytnik@gmail.com>

ADD ./target/registry.jar /app/
CMD ["java", "-jar", "/app/registry.jar"]

EXPOSE 8761