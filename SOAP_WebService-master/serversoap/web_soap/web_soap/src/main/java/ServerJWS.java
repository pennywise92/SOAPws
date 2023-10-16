import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9999/",new BanqueService());
        System.out.println("Web Service déployé sur http://0.0.0.0:9999/");
    }
}
