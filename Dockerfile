# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM openjdk:8
ADD dock.jar dock.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "dock.jar"]
