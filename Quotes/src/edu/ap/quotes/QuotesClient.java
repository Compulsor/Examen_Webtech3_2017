package edu.ap.quotes;

import org.restlet.resource.ClientResource;

public class QuotesClient {

    // http://hc.apache.org/
     public static void main(String[] args) {
           
             try {
            	ClientResource resource = new ClientResource("http://127.0.0.1:8181/quotes/allquotes");
            	
        		String content = ReadFile.readFile();
        		resource.post(content);
            	
            	// Write the response entity on the console
            	resource.get().write(System.out);
            	System.out.println();
            	
            	System.out.println(ReadFile.readFile());
            }
            catch (Exception e) {
                System.out.println("In main : " + e.getMessage());
            }
        }
    }
