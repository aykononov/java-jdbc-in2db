## Java-JDBC-in2db

### Технологии.

* **Java SE** - по ТЗ ограничено версией 1.6
* **JDBC** - драйвер подключения БД к приложению Java.
* **maven** - фреймворк для автоматизации сборки проектов на основе описания их структуры в файлах на языке POM (англ. Project Object Model).
* **Oracle Data Base** - используемая БД [Oracle Database Express Edition (XE) download](https://www.oracle.com/database/technologies/xe-downloads.html "https://www.oracle.com/database/technologies/xe-downloads.html");

### Функционал.

1. Настройки приложения, хранятся в конфигурационном файле (config.ini)
2. При запуске приложение проверяет наличие конфигурационного файла.
3. Читает настройки из конфигурационного файла и подключается к БД.

### Сборка исполняемого jar-файла в командной строке.

Используя **shell**, перейдите в корневой каталог проекта (*где находится файл pom.xml*) и введите:

    mvn clean package  
    cd target  

### Сборка исполняемого jar-файла в IntelliJ IDEA.
    
Справа раскрываем вкладку "Maven" и выбираем:

    "clean", жмем "Run"
    "package", жмем "Run".  

Готовый jar-файл будет в директории:

    src/target/in2db-1.0-SNAPSHOT.jar


### Запуск приложения.
    
    java -jar in2db-1.0-SNAPSHOT.jar
