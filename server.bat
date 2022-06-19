@echo Prepare to run Spring-Boot Application
@pause
@echo Run Spring Boot Application...
start "userlist" mvn spring-boot:run
@echo Next step will terminate process before exit
@pause
taskkill /FI "WINDOWTITLE eq userlist - mvn   spring-boot:run"
@pause