package salbinsson.game.text.main;

import salbinsson.game.text.inout.Buffer;
import salbinsson.game.text.world.Player;
import salbinsson.game.text.world.Place.x;
import salbinsson.game.text.world.Place.y;
import salbinsson.game.text.world.Place;

public class Start {
	


	public static void main(String[] args) {
		
		Place P = new Place(x.A,y.b);
		String S="";
		Buffer buffer = new Buffer();
		buffer.write ("Hello");
		S = buffer.read();
		buffer.write ("Wasssuup " + S);
		
		Player MesaMoh = new Player(12,18,S,P);
		buffer.write(MesaMoh.GetName() + " has a hit rate of "+ MesaMoh.GetHit()+" and "+MesaMoh.GetHealthV() + ".");
	} 

}
