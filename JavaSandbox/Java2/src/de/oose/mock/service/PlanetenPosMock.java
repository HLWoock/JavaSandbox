package de.oose.mock.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import de.oose.mock.business.Planet;

import static de.oose.mock.business.Planet.*;

public class PlanetenPosMock implements PlanetenPosDAO {

	Map<Planet, Double > laenge = new HashMap<Planet, Double>();
	Map<Planet, Double > breite = new HashMap<Planet, Double>();
	Map<Planet, Integer> radius = new HashMap<Planet, Integer>();
	public PlanetenPosMock() {
		radius.put(mercury, 10);
		radius.put(venus, 22);
		radius.put(earth, 30);
		radius.put(mars, 30);
		radius.put(jupiter, 156);
		radius.put(saturn, 284);
		radius.put(uranus, 574);
		radius.put(neptune, 880);
	}
	
	@Override
	public int radius(Planet planet, Date date) {
		return radius.get(planet);
	}

	@Override
	public double laenge(Planet planet, Date date) {
		return 2 * Math.PI * new Random().nextDouble();
	}

	@Override
	public double breite(Planet planet, Date date) {
		return  2 * Math.PI * new Random().nextDouble();
	}

}
