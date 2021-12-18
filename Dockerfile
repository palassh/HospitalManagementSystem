FROM openjdk:11
COPY ./build/libs/DischargeDetail-0.0.1.jar DischargeDetail-0.0.1.jar
CMD ["java","-jar","DischargeDetail-0.0.1.jar"]