# Aplicación Spring Boot con WebSocket

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.4-brightgreen)
![Java](https://img.shields.io/badge/Java-17-orange)

Este repositorio contiene una aplicación de ejemplo que utiliza Spring Boot y WebSocket para habilitar la comunicación en tiempo real entre el servidor y el cliente. El WebSocket es un protocolo de comunicación bidireccional que permite la transferencia de datos en tiempo real, ideal para aplicaciones de chat en línea, paneles de control en tiempo real, actualizaciones de estado en vivo, etc. Este proyecto debe ejecutarse gon el front-end del repositorio ![front-end](https://github.com/alvaro-salazar/binary-websocket-front)

## ¿Qué es WebSocket?

WebSocket es un protocolo de comunicación de red que proporciona conexiones bidireccionales en tiempo real a través de un único socket TCP. A diferencia del protocolo HTTP tradicional, que sigue un modelo de solicitud-respuesta, WebSocket permite que tanto el cliente como el servidor se comuniquen de manera independiente en cualquier momento, enviando mensajes en ambas direcciones.

### Ventajas de WebSocket:

- **Comunicación en tiempo real**: WebSocket es ideal para aplicaciones que requieren actualizaciones en tiempo real, como chats, juegos en línea y paneles de control en vivo.

- **Bajo costo de recursos**: A diferencia de mantener conexiones HTTP constantes, WebSocket reduce la sobrecarga del servidor y el ancho de banda al utilizar una conexión persistente.

- **Menos latencia**: La comunicación en tiempo real es más rápida y eficiente, lo que reduce la latencia en comparación con las solicitudes HTTP repetidas.

### Comunicación Binaria en WebSocket

WebSocket admite tanto la comunicación de texto como la comunicación binaria. En esta aplicación de ejemplo, nos centraremos en la comunicación binaria. La comunicación binaria es útil cuando se desean transferir datos binarios, como flujos de audio, video o archivos. La ventaja principal de la comunicación binaria es la eficiencia, ya que no es necesario codificar y decodificar datos complejos.

## Requisitos previos

Antes de ejecutar la aplicación, asegúrate de tener instalados los siguientes requisitos en tu sistema:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- Un IDE compatible con Spring Boot (como [Spring Tool Suite](https://spring.io/tools) o [IntelliJ IDEA](https://www.jetbrains.com/idea/))
- Un navegador web compatible con WebSocket (recomendamos Google Chrome)

## Configuración

La configuración de la aplicación se encuentra en el archivo `src/main/resources/application.properties`. Aquí puedes personalizar la configuración según tus necesidades específicas. Asegúrate de revisar este archivo antes de ejecutar la aplicación.

## Ejecución

Sigue estos pasos para ejecutar la aplicación:

1. Clona este repositorio en tu máquina local:

   ```bash
   git clone https://github.com/tuusuario/tu-repositorio.git

2. Abre el proyecto en tu IDE preferido.

3. Ejecuta la clase WebSocketServerApplication. Esto iniciará la aplicación Spring Boot en el puerto 8080.

4. Abre tu navegador web y accede a un front-end que implemente websockets para interactuar con la aplicación.

## Estructura del Proyecto

Es útil incluir una breve descripción de la estructura del proyecto para que los colaboradores y usuarios comprendan dónde encontrar archivos y recursos clave. Puedes incluir una sección que explique la organización de directorios y archivos, por ejemplo:


- `src/`: Contiene el código fuente de la aplicación.
    - `main/`: Directorio principal.
        - `java/`: Código fuente Java.
        - `resources/`: Recursos de la aplicación, como archivos de configuración.
    - `test/`: Directorio para pruebas unitarias y de integración.


## Uso
La aplicación de ejemplo te permite demostrar diversas funcionalidades relacionadas con la comunicación en tiempo real a través de WebSocket. Algunas de las interacciones que puedes realizar incluyen:

Enviar y recibir mensajes binarios entre el servidor y el cliente.
Establecer una comunicación bidireccional en tiempo real.
Observar cómo los mensajes se entregan sin necesidad de recargar la página.

### Comunicación Binaria en Detalle

En esta aplicación, se envían y reciben datos binarios a través de WebSocket. Cuando un cliente envía datos binarios al servidor, este los procesa y luego envía datos binarios de vuelta al cliente. La comunicación binaria es útil para flujos de datos en tiempo real, como señales, audio o video.




## Contribución
Si deseas contribuir a esta aplicación o tienes comentarios sobre mejoras, por favor, siéntete libre de colaborar. Puedes realizar contribuciones mediante solicitudes de extracción (pull requests) o informar sobre problemas (issues) en este repositorio. Apreciamos y valoramos tu contribución.

## Licencia
Este proyecto se encuentra bajo la Licencia MIT, lo que significa que puedes utilizar, modificar y distribuir este código según los términos de dicha licencia. Para obtener más detalles, consulta el archivo LICENSE incluido en este repositorio.

¡Esperamos que esta aplicación de ejemplo te ayude a comprender mejor cómo funciona WebSocket en una aplicación Spring Boot y cómo se implementa la comunicación binaria en tiempo real! Si tienes alguna pregunta o necesitas asistencia adicional, no dudes en contactarnos. ¡Disfruta explorando y aprendiendo!

