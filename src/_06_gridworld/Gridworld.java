package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		World world = new World();
		
		Bug bug = new Bug();
		Bug bugTwo = new Bug();
		Flower flower = new Flower();
		Flower flowerTwo = new Flower();
		world.add(new Location(1,1),bug);
		world.add(new Location(4,6), bugTwo);
		bugTwo.setColor(Color.blue);
		bugTwo.turn();
		bugTwo.turn();
		world.add(new Location(4,5), flower);
		world.add(new Location(4,7), flowerTwo);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				
			}
		}
		
		world.show();
	}
}
