package by.htp.model;

public class Planet {

	String nameOfPlanet;
	int weightOfPlanet;
	int radiusOfPlanet;
	
	public Planet() {
		
	}
	
	public Planet(String nameOfPlanet, int weighOfPlanet, int radiusOfPlanet ) {
		this.weightOfPlanet = weightOfPlanet;
		this.radiusOfPlanet = radiusOfPlanet;
		this.nameOfPlanet = nameOfPlanet;
	}
}
