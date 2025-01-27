package edu.ap.webtech	;

import java.io.FileWriter;
import java.io.IOException;
import org.restlet.resource.ClientResource;

public class HospitalClient {

    
 	@SuppressWarnings("unchecked")
 	public static void main(String[] args) throws IOException {
  
 		 try {
 	       	ClientResource resource = new ClientResource("http://localhost:8182/ziekenhuis/patienten");
 	       	// Post a new race
 	       	String patient1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
 	       	patient1 += "<patient id=\"231\" datumEnUur=\"01/25/2017-14:30\" naamPatient=\"Lennart Schelfhout\" geboorteDatum=\"10/09/1997\" naamVerpleegkundige=\"lol\">";
 	       	patient1 += "<diagnose>Ziek</diagnose>";
 	       	patient1 += "</patient>";
 	   		resource.post(patient1);
 	   		// get the response
 	       	System.out.println(resource.getResponseEntity().getText());
 	       	
 	       	String patient2 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
 	       	patient2 += "<patient id=\"321\" datumEnUur=\"25/01/2017 - 15:00\" naamPatient=\"Philippe Possemiers\" geboorteDatum=\"19/04/1997\" naamVerpleegkundige=\"Koetreintje\">";
 	       	patient2 += "<diagnose>Griep</diagnose>";
 	       	patient2 += "</patient>";
 	   		resource.post(patient2);
 	   		// get the response
 	       	System.out.println(resource.getResponseEntity().getText());
 	       }
 	       catch (Exception e) {
 	           System.out.println("In main : " + e.getMessage());
 	       }

 		}
    }
