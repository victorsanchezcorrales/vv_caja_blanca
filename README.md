# Verificación y Validación del Software 2021

GRUPO 1 IWT-42  

## Instrucciones Maven

### Pre-requisitos 📋

- Para utilizar los comandos directamente en su terminal deber tener instalado, como mínimo, [Maven 3.6.3](https://downloads.apache.org/maven/maven-3/3.6.3/binaries/).

- También puede utilizar los comandos con el plugin de su IDE. En Eclipse: ```Run > Run Configurations… ``` 

- Para poder utilizar Maven para ejecutar los test debe instalar la dependencia del ```SingleList.jar```. Para ello, configure la ejecución de Maven añadiendo en Goals: 
```
install:install-file -Dfile=/MY/PATH/SingleList.jar -DgroupId=com.singleList -DartifactId=SingleList -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar
``` 
Reemplazando ```/MY/PATH``` por la ruta donde se encuentre el fichero en su equipo.

### Ejecutar los test ⚙️

- Para compilar y ejecutar los test use el comando:
```
mvn test 
```
- Para ejecutar los test de una determinada clase utilice ```mvn -Dtest=<nombre clase> test```. Por ejemplo:
```
mvn test -Dtest=MayorLongitudTest test
```
- Para ejecutar los test de un determinado método utilice ```mvn -Dtest=<nombre clase>#<nombre metodo> test```. Por ejemplo:
```
mvn test -Dtest=MayorLongitudTest#Test4 test 
```
### Generar informes 📄
- Al ejecutar los test se generan informes en formato ```.txt``` y ```.xml``` en ```.target/surefire-reports```
- Para generar un informe en formato ```.html``` utilice el comando:
```
mvn surefire-report:report
```

### Empaquetar proyecto 📦

- Para empaquetar el proyecto en un ```.jar``` utilice:
```
mvn package
```
-  El fichero estará en ```./target```

### Limpiar fichero generados 🧹
- Para eliminar los ficheros generados en la carpeta ```./target``` use el comando:
```
mvn clean
```

 

