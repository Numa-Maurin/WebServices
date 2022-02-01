import javax.xml.ws.Endpoint;
import java.util.Date;

 public class Lanceur {

   public static void main(String[] args){

     ChambreInstance service = new ChambreInstance();
     Endpoint ep = Endpoint.create(service);

     ep.publish("http://localhost:10000/ReservationVoyage");

   }

 }
