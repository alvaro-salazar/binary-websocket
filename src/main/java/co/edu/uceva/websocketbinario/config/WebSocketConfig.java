package co.edu.uceva.websocketbinario.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * Clase de configuración para habilitar el soporte de WebSocket.
 */
@Configuration
public class WebSocketConfig {
    /**
     * Habilita el soporte de WebSocket para el servidor. Esta clase debe ser registrada como un bean para que funcione.
     * @return Retorna un objeto de tipo ServerEndpointExporter que habilita el soporte de WebSocket para el servidor.
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
