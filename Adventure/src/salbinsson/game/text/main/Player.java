package salbinsson.game.text.main;
import salbinsson.game.text.stats.*;
public class Player {
	Accuracy acc = new Accuracy();
	String Name = "Default";
	
	Player (int hit, int health, String N) {
			acc.hit = hit;
			acc.health = health;
			Name = N;
	}


}
