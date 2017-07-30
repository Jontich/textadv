package salbinsson.game.text.main;
import salbinsson.game.text.stats.*;
public class Player {
	Accuracy acc = new Accuracy();
	String Name = "Default";
	enum Friendly {good, bad, ugly}; 
	
	
	Player (int hit, int health, String N) {
			Friendly F = Friendly.good;
			acc.hit = hit;
			acc.health = health;
			Name = N;
	}


}
