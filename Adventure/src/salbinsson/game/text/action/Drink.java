package salbinsson.game.text.action;

import java.util.Scanner;

public class Drink implements Action {
	@Override
	public void run(Scanner args) {
		if (!args.hasNext())
			throw new IllegalArgumentException("What should I drink?");
		System.out.println("Drinking " + args.next());
	}
}