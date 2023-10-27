package salbinsson.game.text.world;
import salbinsson.game.text.stats.*;
import salbinsson.game.text.world.Place.*;
public class Player {
	Accuracy acc = new Accuracy();
	String Name = "Default";
	enum Friendly {good, bad, ugly}; 
	Friendly F = Friendly.good;
	Place P = new Place (x.A,y.a);


	
	public Player (int hit, int health, String N, Place p) {
			acc.hit = hit;
			acc.health = health;
			Name = N;
			P = p;
	}

	public String GetName() {
		return Name;
	}

	public int GetHit () {
		return acc.hit;
	}
	public int GetHealth () {
		return acc.health;
	}

}
