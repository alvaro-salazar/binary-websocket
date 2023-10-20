package co.edu.uceva.websocketbinario;

import co.edu.uceva.websocketbinario.config.WebSocketConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.BinaryWebSocketHandler;

/**
 * Clase principal de la aplicación Spring Boot.
 * Esta clase contiene el método main, que es el punto de entrada de la aplicación.
 */
@SpringBootApplication // Esta anotación marca la clase principal de la aplicación Spring Boot.
@EnableWebSocket // Esta anotación habilita el soporte para WebSocket.
@ComponentScan(basePackageClasses = {WebSocketConfig.class, BinaryWebSocketHandler.class}) // Esta anotación escanea los paquetes en busca de componentes de Spring.
public class WebSocketServerApplication {

	/**
	 * Método main, que es el punto de entrada de la aplicación.
	 * @param args Argumentos de la línea de comandos.
	 */
	public static void main(String[] args) {
		SpringApplication.run(WebSocketServerApplication.class, args);
	}
}

