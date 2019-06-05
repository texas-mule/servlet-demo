
FROM tomcat:8.5
ADD target/servlet-demo.war /usr/local/tomcat/webapps/servlet-demo.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar servlet-demo.jar
