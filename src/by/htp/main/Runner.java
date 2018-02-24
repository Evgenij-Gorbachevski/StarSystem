package by.htp.main;

import by.htp.model.Planet;
import by.htp.model.Star;
import by.htp.model.StarsSystem;

public class Runner {

	public static void main(String[] args) {
	
		StarsSystem ss = new StarsSystem("Mlechnyj put");
		
		Star ss1 = new Star("Mars", 456,666);
		Star ss2 = new Star("Pluton", 7787,963);
		
		ss.addStar(ss1);
		ss.addStar(ss2);
		
		Planet pl1 = new Planet("Mercury",858,9456);
		Planet pl2 = new Planet("Venera",8889,9823);
		Planet pl3 = new Planet("Mercury",858,9456);
		Planet pl4 = new Planet("Venera",8889,9823);
		
		
		ss.addPlanet(pl1);
		ss.addPlanet(pl2);
		ss.addPlanet(pl3);
		ss.addPlanet(pl4);
		
		ss.getCountOfStars();
		ss.getCountOfPlanets();

		System.out.println();
		
				
	}

}
