package salbinsson.game.text.main;
import salbinsson.game.text.stats.*;
import salbinsson.game.text.stats.Place.*;
public class Player {
	Accuracy acc = new Accuracy();
	String Name = "Default";
	enum Friendly {good, bad, ugly}; 
	Friendly F = Friendly.good;
	Place P = new Place (x.A,y.a);

	
	Player (int hit, int health, String N, Place p) {
			Friendly F = Friendly.good;
			acc.hit = hit;
			acc.health = health;
			Name = N;
			P = p;
	}


}
