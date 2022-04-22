# Specify Java runtime
FROM java:11

# Specify port
EXPOSE 6969

ADD target/schedubowl-spring-maven schedubowl-spring-maven

ENTRYPOINT ["java", "-jar","schedubowl-spring-maven"]