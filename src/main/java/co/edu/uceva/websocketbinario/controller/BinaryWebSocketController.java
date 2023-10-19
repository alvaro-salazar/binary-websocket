package co.edu.uceva.websocketbinario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.BinaryWebSocketHandler;

/**
 * Controlador que maneja las conexiones WebSocket y los mensajes binarios que se reciben.
 */
@Controller
public class BinaryWebSocketController extends BinaryWebSocketHandler {

    /**
     * Este método se llama cuando se recibe un mensaje binario de un cliente.
     * El mensaje se recibe como un objeto de tipo BinaryMessage.
     * El método se encarga de enviar una respuesta al cliente.
     * @param session Es la sesión del cliente que envía el mensaje
     * @param message Es el mensaje que se recibe del cliente
     * @throws Exception Se lanza una excepción si no se puede enviar la respuesta al cliente
     */
    @Override
    protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) throws Exception {
        // Este método se llama cuando se recibe un mensaje binario
        byte[] binaryData = message.getPayload().array();

        // Realiza acciones con los datos binarios, por ejemplo, enviar una respuesta
        session.sendMessage(new BinaryMessage("Respuesta: ".getBytes()));
    }
}
