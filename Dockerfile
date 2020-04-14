FROM openliberty/open-liberty:full-java13-openj9-ubi

COPY src/main/liberty/config/server.xml /config/

COPY target/hello.war /config/dropins/
