package salbinsson.game.text.world;

import java.util.*;

import salbinsson.game.text.inout.Buffer;
import salbinsson.game.text.world.Place.*;


public class PlayerList {

	  public static void main(String args[]) { 
		  Buffer buffer = new Buffer();
	      Set<Player> set = new HashSet<Player>();
	      try {
	         for(int i = 0; i < 5; i++) {
	            set.add(new Player(12,99,"Mes_"+ i,new Place (x.A,y.a)));
	         }
	         System.out.println(set);
	         Iterator<Player> iterator = set.iterator();
	         while(iterator.hasNext()) {
	            Player player = iterator.next();
	            //System.out.println(element);
	    		buffer.write(player.Name + " has a hit rate of "+ player.acc.hit+" and a healt of "+player.acc.health + ". He is "+ player.F + " and resides at position: "+ player.P.p.X.name()+"," +player.P.p.Y.name());	

	         }

	      }
	      catch(Exception e) {}
	   }

}
