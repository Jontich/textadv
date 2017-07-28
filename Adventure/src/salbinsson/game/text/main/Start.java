package salbinsson.game.text.main;

import salbinsson.game.text.inout.Buffer;

public class Start {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="";
		Buffer buffer = new Buffer();
		buffer.write ("Hello");
		S = buffer.read();
		buffer.write ("Wasssuup " + S);
		
		Player MesaMoh = new Player (12,99,S);
		buffer.write(MesaMoh.Name + " has a hit rate of "+ MesaMoh.acc.hit+" and a healt of "+MesaMoh.acc.health + ".");
	}

}
