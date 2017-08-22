package salbinsson.game.text.action;

import java.util.Scanner;

public class Look implements Action {
	@Override
	public void run(Scanner args) {
		if (!args.hasNext())
			throw new IllegalArgumentException("Where should I look?");
		System.out.println("Looking " + args.next());
	}
}
