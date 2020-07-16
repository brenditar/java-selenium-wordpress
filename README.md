# Framework para automatización con Java y Selenium


# Para correr allure
Allure es una herramienta flexible y liviana para varios lenguajes de programación que sirve para generar informes/reportes sobre las pruebas, con la posibilidad de añadir imágenes y registros

Descargar allure del siguiente [link](https://launchpad.net/~qameta/+archive/ubuntu/allure/+files/allure_2.4.1~xenial_all.deb)

## pasos para instalar allure en local.
    $ sudo dpkg -i allure_2.4.1_xenial_all.deb
    $ mvn clean test # correr tests
    $ mvn site # recopilar informacion de tests para mostrar en allure
    $ allure open target/site/allure-maven-plugin
    otra forma de levantar los reportes de allure
    $ allure serve target/surefire-reports
