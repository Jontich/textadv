package salbinsson.game.text.stats;

import java.util.Vector;

public class Place {
	
	Vector<Vector<Double>>  matrix= new Vector<Vector<Double>>();
	public enum x {A,B,C,D};
	public enum y {a,b,c,d};
	public Pos p = new Pos ();
	
	public class Pos {
		public x X;
		public y Y;
	}
	
	public Place (x X,y Y) {
		p.X=X;
		p.Y=Y;
		
	}
	
	public void set(x X,y Y) {
		
		
	}
	
	
}
