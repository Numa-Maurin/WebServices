import javax.xml.ws.Endpoint;
import java.util.Date;

 public class ChambreWebServicePublisher {

   public static void main(String[] args){

     Lanceur service = new Lanceur();
     Endpoint ep = Endpoint.create(service);

     ep.publish("http://localhost:10000/ReservationVoyage");

   }

 }
