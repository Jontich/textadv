package salbinsson.game.text.inout;

import salbinsson.game.text.action.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Parse {
	
	public enum Cmd {W,E,N,S, INV,ATTACK,LOOK};
	
	public Cmd Interpret (String S) {
		
		return Cmd.S;
	}
	
	public static void main(String[] args) {
		Map<String, Action> actions = new HashMap<>();
		actions.put("look", new Look());
		actions.put("drink", new Drink());

		String command = "drink coke";
		command = "look west";

		// Parse
		Scanner cmdScanner = new Scanner(command);
		actions.get(cmdScanner.next()).run(cmdScanner);
		
	}
	

}
