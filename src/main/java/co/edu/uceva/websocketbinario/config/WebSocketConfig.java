package co.edu.uceva.websocketbinario.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Esta clase configura WebSocket en la aplicación.
 * WebSocket es una tecnología que permite la comunicación bidireccional en tiempo real entre un servidor y un navegador web.
 */
@Configuration  // Indica que esta clase es una configuración de la aplicación
@EnableWebSocket // Habilita el soporte WebSocket en la aplicación en su conjunto
public class WebSocketConfig implements WebSocketConfigurer {


    /**
     * Registra un manejador de mensajes WebSocket en el registro de manejadores.
     * Aquí estamos configurando los manejadores WebSocket que estarán disponibles en ciertas rutas.
     * @param registry el registro de manejadores
     */
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // El manejador "EchoBinaryHandler" manejará las conexiones WebSocket en la ruta "/binary".
        registry.addHandler(new EchoBinaryHandler(), "/binary").setAllowedOriginPatterns("*");

        // El manejador "RamdomBinaryHandler" manejará las conexiones WebSocket en la ruta "/random-binary".
        registry.addHandler(new RamdomBinaryHandler(), "/random-binary").setAllowedOriginPatterns("*");

        // Las rutas son como direcciones web que permiten a los navegadores conectarse a estos manejadores específicos.
        // Por ejemplo, un navegador web podría conectarse a "ws://localhost:8080/binary" para usar el manejador "EchoBinaryHandler".
    }
}
