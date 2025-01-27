package edu.ap.fileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadFile {
	
	private static String FILE = "C:/Users/schel/workspace/Quotes/oscar_wilde.txt";
	private static String content;
	
	public static String readFile() throws FileNotFoundException, IOException {
		try(BufferedReader br = new BufferedReader(new FileReader(FILE))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    content = sb.toString();
		}
		
		return content;
	}
	
	public static String getQuotesWithWord(String word) {
		return null;
		//System.out.println("Oeps, nog niks...");
	}

}