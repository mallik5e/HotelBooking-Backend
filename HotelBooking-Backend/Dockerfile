FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar HotelBooking-Backend.jar
ENTRYPOINT ["java","-jar","/HotelBooking-Backend.jar"]
EXPOSE 8080