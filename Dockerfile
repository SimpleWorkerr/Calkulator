FROM openjdk:19

WORKDIR /usr/src/my_app

COPY ./out/production/Calkulator /usr/src/my_app

ENTRYPOINT ["java","Main"]
