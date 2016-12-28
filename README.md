# SpringDataMongoDB-MVC-CRUD
Spring Boot Project with Spring Data MongoDB, Spring MVC CRUD Operations

To run MongoDB daemon (Ctrl+C to end)
c:\Program Files\MongoDB\Server\3.4\bin>mongod --config "c:\Program Files\MongoDB\Server\conf\mongodb.conf"

To Create Microsoft Service to start/stop the MongoDB instance

c:\Program Files\MongoDB\Server\3.4\bin>mongod --config "c:\Program Files\MongoDB\Server\conf\mongodb.conf" --install --serviceName mongodb27017 --serviceDisplayName "MongoDB Server Instance on Port 27017" --serviceDescription "MongoDB 3.4 Server instance running on port 27017"

From Windows service, we can start/stop the server.

To remove the service
c:\Program Files\MongoDB\Server\3.4\bin>mongod --config "c:\Program Files\MongoDB\Server\conf\mongodb.conf" --remove --serviceName mongodb27017 --serviceDisplayName "MongoDB Server Instance on Port 27017" --serviceDescription "MongoDB 3.4 Server instance running on port 27017"


mongodb.conf contains following

dbpath = C:\Program Files\MongoDB\Server\data\
port = 27017
logpath = C:\Program Files\MongoDB\Server\logs\mongo.log


Reference:
https://dzone.com/articles/install-set-and-start-mongodb

Tutorial Followed
http://campus.codeschool.com/courses/the-magical-marvels-of-mongodb/level/1/section/1/video/1
http://www.journaldev.com/3963/mongodb-java-crud-example-tutorial
http://www.journaldev.com/4144/spring-data-mongodb-example
http://www.baeldung.com/spring-data-mongodb-tutorial
