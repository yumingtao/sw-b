FROM fabric8/java-alpine-openjdk8-jdk
VOLUME /tmp
ADD build/libs/sw-b-0.0.1-SNAPSHOT.jar /deployments/app.jar
ADD run.sh /deployments/run.sh
RUN sh -c 'touch /deployments/app.jar'
RUN echo "Asia/Shanghai" > /etc/timezone
RUN chmod 755 /deployments/run.sh
CMD ["/deployments/run.sh"]
EXPOSE 8181
