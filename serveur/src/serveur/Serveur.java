package serveur;

import javax.xml.ws.Endpoint;
import ws.Calculatrice;

/**
 *
 * @author tuo
 */
public class Serveur {

    public static void main(String[] args) {
        Endpoint.publish("http://192.168.43.212:8080/ws/demo", new Calculatrice());
        System.out.println("Effectué");
    }
}
