FROM java:8u92-jre-alpine
MAINTAINER Alexey Zhytnik <alexeyzhytnik@gmail.com>

ADD ./target/gateway.jar /app/
CMD ["java", "-jar", "/app/gateway.jar"]

EXPOSE 4000