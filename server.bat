@echo Prepare to run Spring-Boot Application
@pause
@echo Run Spring Boot Application...
start "userlist" mvn spring-boot:run
start "" http://localhost:8080/
@echo Prepare to terminate process before exit
@pause
taskkill /FI "WINDOWTITLE eq userlist - mvn   spring-boot:run"
@pause