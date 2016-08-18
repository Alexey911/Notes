FROM java:8-jre
MAINTAINER Alexey Zhytnik <alexeyzhytnik@gmail.com>

ADD ./target/config.jar /app/
CMD ["java", "-jar", "/app/config.jar"]

EXPOSE 8888