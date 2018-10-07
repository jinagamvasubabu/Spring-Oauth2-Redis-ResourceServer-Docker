FROM frolvlad/alpine-oraclejdk8:slim
EXPOSE 8083 8083
LABEL maintainer="vasubabu"
ADD ["target/*.jar", "ResourceServer.jar"]
ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,suspend=n"
RUN sh -c 'touch /ResourceServer.jar'
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar ResourceServer.jar" ]