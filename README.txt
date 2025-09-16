

PROYECTO DEMOBLAZE

# Proyecto: Serenity BDD - DEMOBLAZE

## Tecnologías usadas:
- IntelliJ IDEA 2024.1.4 - Build #IC-241.18034.62
- Java vs 17.0.4
- Maven vs 4.0.0
- JUnit vs 4.2.34
- Serenity BDD vs 4.2.34
- Cucumber-jvm@7.22.2 
- SO Windows 11 Pro
- Chrome Driver vs 140.0.7339.82 
- Navegador Chrome vs 140.0.7339.128 



## Pasos de ejecución:
1. Descargar el proyecto serenity_demoblaze del github: https://github.com/evelynbalseca/proyecto_e2e_demoblaze.git
2. Importar el proyecto descargado en IntelliJ.
3. Ejecutar el archivo RunCucumber.java que se encuntra en src/test/java/com/demoblaze/configs
4. Al finalizar las pruebas revisar el reporte en la consola en la seccion "View your Cucumber Report at"


Importante:
Si la version del navegador chrome en el cual se va a ejecutar las pruebas automatizadas es diferente al mencionado en la seccion Tecnologias usadas,
se debe realizar el siguiente proceso para actualizar el chrome driver que yo utlice para mis pruebas:
1. Descargar el Chrome Driver para SO Windows de la pagina https://storage.googleapis.com/chrome-for-testing-public/140.0.7339.82/win64/chromedriver-win64.zip
2. Descomprimir el zip. ubicar el archivo chromedriver.exe.
3. Reemplazar el chromedriver que se encuentra en la ruta del proyecto serenity_demoblaze/src/test/resources/webdrivers/chromedriver.exe con el nuevo archivo chromedriver.



