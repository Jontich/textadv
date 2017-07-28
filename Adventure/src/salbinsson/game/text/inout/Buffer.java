package salbinsson.game.text.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
	
	public void write(String S) {
	   System.out.println(S);
	}
	
	public String read () {
		String text ="";
		try {
			text = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return text;
	}

}
