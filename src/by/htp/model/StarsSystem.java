package by.htp.model;

public class StarsSystem {

	public String nameOfStarSystem;
	public int countOfStars;
	public int countOfPlanets;
	public Star[] stars;
	public Planet[] planets;

	public StarsSystem(String nameOfStarSystem) {
		this.nameOfStarSystem = nameOfStarSystem;
		System.out.println("The name of stars system is " + nameOfStarSystem);
	}

	public void info() {
		for (int i = 0; i < stars.length; i++) {
			if (countOfStars > 0) {
				stars = new Star[countOfStars];
				for (int j = 0; j < countOfStars; j++) {
					stars[j] = new Star("Mars", 266, 333);
				}
				System.out.println();
			}
		}
	}

	public String getNameOfStarSystem() {
		return nameOfStarSystem;
	}

	public void setNameOfStarSystem(String nameOfStarSystem) {
		this.nameOfStarSystem = nameOfStarSystem;
	}

	public Star[] getStar() {
		return stars;
	}

	public void setStar(Star[] stars) {
		if (stars != null) {
			this.stars = stars;
		}
	}

	public Planet[] getPlanet() {
		return planets;
	}

	public void setPlanet(Planet[] planets) {
		if (planets != null) {
			this.planets = planets;
		}
	}

	public Star[] getStars() {
		return stars;
	}

	
	public void addStar(Star star) {
		if (stars != null) {
			if (countOfStars < stars.length) {
				stars[countOfStars] = star;
				countOfStars++;
			} else {
				Star[] starss = new Star[this.stars.length + 10];
				for (int i = 0; i < this.stars.length; i++) {
					stars[i] = this.stars[i];
				}
				this.stars = stars;
				addNewStar(star);
			}
		} else {
			this.stars = new Star[10];
			addNewStar(star);
		}
	}

	private void addNewStar(Star star) {
		this.stars[countOfStars] = star;
		countOfStars++;
	}

	public void addPlanet(Planet planet) {
		if (planets != null) {
			if (countOfPlanets < planets.length) {
				planets[countOfPlanets] = planet;
				countOfPlanets++;
			} else {
				Planet[] planets = new Planet[this.planets.length + 10];
				for (int i = 0; i < this.planets.length; i++) {
					planets[i] = this.planets[i];
				}
				this.planets = planets;
				addNewPlanet(planet);
			}
		} else {
			this.planets = new Planet[10];
			addNewPlanet(planet);
		}
	}

	private void addNewPlanet(Planet planet) {
		this.planets[countOfPlanets] = planet;
		countOfPlanets++;
	}
	
	public int getCountOfStars() {
		System.out.println("Count of stars: "+countOfStars);
		return countOfStars;
	}

	public void setCountOfStars(int countOfStars) {
		this.countOfStars = countOfStars;
	}

	public int getCountOfPlanets() {
		System.out.println("Count of planets: "+countOfPlanets);
		return countOfPlanets;
	}

	public void setCountOfPlanets(int countOfPlanets) {
		this.countOfPlanets = countOfPlanets;
	}

}
