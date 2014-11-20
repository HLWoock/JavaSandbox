package de.oose.mock.service;

import java.util.Date;

import de.oose.mock.business.Planet;

public interface PlanetenPosDAO {
	public int    radius(Planet planet, Date date);
	public double laenge(Planet planet, Date date);
	public double breite(Planet planet, Date date);
}
