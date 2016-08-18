FROM java:8-jre
MAINTAINER Alexey Zhytnik <alexeyzhytnik@gmail.com>

ADD ./target/gateway.jar /app/
CMD ["java", "-jar", "/app/gateway.jar"]

EXPOSE 4000