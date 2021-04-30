#PRUEBA FALABELLA

Prueba técnica GML SOFTWARE

#¿CÓMO EJECUTAR EL PROYECTO?
1. Tener Instalado un IDE - Eclipse o NetBeans
2. Tener Instalado Java 1.8 JDK - Configurar variables de Entorno
3. Tener Instalado MAVEN - Configurar variables de Entorno
4. Tener Instalado cucumber
5. Importar proyecto
6. Configuración de las variables de entorno WINDOWS
``
MAVEN_HOME
\Maven\apache-maven-3.5.0
MAVEN
%MAVEN_HOME%\bin
JAVA_HOME
\Program Files\Java\jdk1.8.0_144 ‘Ruta del JDK
Agregar al path lo siguiente:
Path
%JAVA_HOME%\bin;%MAVEN%
``
7. Verificar que MAVEN este instalado correctamente. Ingresar a CMD y escribir "mvn -version"
8. En la ruta: /prueba_falabella/src/test/resources/driver actualizar los controladores web.
	--> chromedriver.exe Utilizar el que sea compatible con el navegador GOOGLE CHROME
	--> geckodriver.exe Utilizar el que sea compatible con el navegador FIREFOX


#Ejecutar en un navegador diferente a chrome
1. Ingresar al siguiente archivo /prueba_falabella/serenity.properties
2. Editar el archivo si se quiere ejecutar por FIREFOX quitar marca de comentario "#" de las lineas  8 y 9, que corresponden a:

``
CONTROLADOR FIREFOX
webdriver.driver=firefox
webdriver.gecko.driver=src/test/resources/driver/geckodriver.exe
``

3. Marcar como comentario "#" en las líneas 4 y 5 que corresponden a:

``
CONTROLADOR CHROME
webdriver.driver=chrome
webdriver.chrome.driver=src/test/resources/driver/chromedriver.exe
``


#Reporte
1. Ingresar a la ruta /prueba_falabella/target/site
2. Ejecutar CMD en esa ruta y pasar el siguiente comando
mvn serenity:aggregate
3. Ingresar a la siguiente ruta /prueba_falabella/target/site/serenity
4. Abrir el archivo index.html



