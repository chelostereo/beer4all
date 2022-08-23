cls
@echo off

echo compilando...
cd actions
@echo actions
javac *.java
xcopy *.class \tomcat50\webapps\beer4all\WEB-INF\classes\beer4all\actions /y /q
del *.class
@echo ---------------------

cd ..\forms
@echo forms
javac *.java
xcopy *.class \tomcat50\webapps\beer4all\WEB-INF\classes\beer4all\forms /y /q
del *.class
@echo ---------------------

cd ..\services
@echo services
javac *.java
xcopy *.class \tomcat50\webapps\beer4all\WEB-INF\classes\beer4all\services /y /q
del *.class
@echo ---------------------

@echo clases
cd..
javac *.java
xcopy *.class \tomcat50\webapps\beer4all\WEB-INF\classes\beer4all /y /q
del *.class
pause

