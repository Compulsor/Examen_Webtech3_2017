package edu.ap.webtech;

import org.restlet.*;
import org.restlet.data.Protocol;

public class HospitalServer {

	public static void main(String[] args) {
		
		try {
			
			// Create a new Component.
		    Component component = new Component();
	
		    // Add a new HTTP server listening on port 8281.
		    component.getServers().add(Protocol.HTTP, 8281);
	
		    // Attach the sample application.
		    component.getDefaultHost().attach("/ziekenhuis", new HospitalApplication());
			component.start();
		} 
	    catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
