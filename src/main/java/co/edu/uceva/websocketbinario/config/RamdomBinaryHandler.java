package co.edu.uceva.websocketbinario.config;

import org.springframework.lang.NonNull;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.BinaryWebSocketHandler;

import java.io.IOException;

/**
 * Este manejador WebSocket procesa y envía datos binarios al cliente. Se puede usar para enviar datos binarios al cliente
 */
public class RamdomBinaryHandler extends BinaryWebSocketHandler {
    @Override
    public void handleBinaryMessage(@NonNull WebSocketSession session, @NonNull BinaryMessage message) {
        try {
            // Este manejador WebSocket procesa y envía datos binarios al cliente.
            byte[] binaryDataReceived = message.getPayload().array(); // Se reciben los datos del cliente (no se usan, pueden ser usados para recibir comandos del cliente)
            byte[] binaryData = new byte[200]; // Se crea un arreglo de bytes de 200 posiciones para enviar datos al cliente

            // Se genera una señal senoidal con una pequeña imperfeccion y se envian al cliente (se envian 100 datos enteros de 16 bits)
            while (true) {
                for(short i = 0; i < binaryData.length-1; i+=2){
                    double seno = Math.sin(i * Math.PI / 50+Math.random()*0.04) * 127+128; //Se agrega una pequeña imperfeccion para que se vea el cambio en la grafica
                    binaryData[i] = (byte) ((short) seno >>8); //Se envian los datos en formato big endian: los 8 bits mas significativos primero
                    binaryData[i+1] = (byte) ((short) seno &0x00FF); //Se envian los 8 bits menos significativos despues
                    Thread.sleep(3); //Se duerme el hilo para que se envien los datos cada 3 milisegundos para simular una frecuencia de muestreo de 333Hz
                }
                session.sendMessage(new BinaryMessage(binaryData)); // Se envian los datos al cliente
            }
        } catch (IOException e) {
            System.out.println("Se cerro la conexion websocket");
        } catch (Exception e) {
            System.out.println("Se detuvo la temporizacion");
        }
    }
}
