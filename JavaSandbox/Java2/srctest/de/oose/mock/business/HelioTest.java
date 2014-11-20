package de.oose.mock.business;

import static de.oose.mock.business.Planet.earth;
import static org.junit.Assert.*;

import java.awt.Image;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.oose.mock.service.PlanetenPosDAO;

public class HelioTest {

	PlanetenPosDAO posMock  = null;
	Leinwand       leinwand = null;
	int            xMax     = 500;
	int            yMax     = 750;
	
	@Before
	public void setUp() throws Exception {
		posMock  = EasyMock.createMock(PlanetenPosDAO.class);
		
		leinwand = new Leinwand(posMock, xMax, yMax);
	}

	@After
	public void tearDown() throws Exception {
		posMock  = null;
		leinwand = null;
	}

	@Test
	public void testLeinwand_Mittelpunkt() {
		assertEquals(xMax / 2, leinwand.mittelpunkt().x);
		assertEquals(yMax / 2, leinwand.mittelpunkt().y);
		
	}
	@Test
	public void testLeinwand_PlanetenPosition() {
		int    radius = 33;
		double angle  = 0.4;
		EasyMock.expect(posMock.radius(earth, null)).andReturn(radius);
		EasyMock.expect(posMock.laenge(earth, null)).andReturn(angle);
		EasyMock.replay(posMock);
		
		Point position = leinwand.getPlanetPosition(earth);
		// polar to Cartesian
		double x = radius * Math.cos(angle) + leinwand.mittelpunkt().x;
		double y = radius * Math.sin(angle) + leinwand.mittelpunkt().y;

		assertEquals(x, position.x, 1);
		assertEquals(y, position.y, 1);
	}
	
	@Test
	public void testLeinwand_GetImage() {
		Image image = leinwand.getImage(earth);
		assertNotNull("image not found", image);
	}
}
