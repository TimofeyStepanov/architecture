FROM gradle:8.4 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon -x test

FROM eclipse-temurin:17-jre-alpine AS scope_image
WORKDIR /src
COPY --from=build /home/gradle/src/score/build/libs/ ./
CMD ["java","-jar","score-0.0.1-SNAPSHOT.jar"]

FROM eclipse-temurin:17-jre-alpine AS auth_image
WORKDIR /src
COPY --from=build /home/gradle/src/auth/build/libs/ ./
CMD ["java","-jar","auth-0.0.1-SNAPSHOT.jar"]

FROM eclipse-temurin:17-jre-alpine AS composition_image
WORKDIR /src
COPY --from=build /home/gradle/src/composition/build/libs/ ./
CMD ["java","-jar","composition-0.0.1-SNAPSHOT.jar"]