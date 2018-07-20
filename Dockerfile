FROM openjdk:8
ADD target/demo.jar demo.jar
EXPOSE 9999:9999
ENTRYPOINT ["java","-jar","demo.jar"]
