
FROM amazoncorretto:17-alpine-jdk
MAINTAINER MELI
COPY target/argenprog-0.0.1-SNAPCHOT.jar argprog-app.jar
ENTRYPOINT ["java", "-jar", "/argprog-app.jar"]

CMD ["/bin/sh"]
