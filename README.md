# Taxpayer Spring Boot application

## Development process

### start mysql docker container

docker container run -d --name mysqldb -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password mysql:latest

### enter mysql container

docker exec -t -i mysqldb /bin/bash

### log in the mysql client

mysql -u root -ppassword

### mysql comands

    show databases //shows the databases
    create database taxpayer //creates a database
    drop database taxpayer //drops database

### connect to mysql docker with UI client
    
    docker inspect 07b72d47c211 | grep "IPAddress"
