package de.oose.mock.business;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import de.oose.mock.service.PlanetenPosDAO;
import de.oose.mock.service.PlanetenPosMock;

public class Leinwand extends JComponent {
	private final String IMAGE_MIME_TYPE = ".png";
	private final String ASSET_PATH      = "D:/workspace_juno/Java2/src/de/oose/mock/assets/";
	private final int X_MAX;
	private final int Y_MAX;

	private PlanetenPosDAO pos;
	
	public Leinwand(PlanetenPosDAO pos, int xMax, int yMax) {
		this.pos = pos;
		X_MAX = xMax;
		Y_MAX = yMax;
	}

	Point mittelpunkt() {
		return new Point((int)(0.5 * X_MAX),(int)(0.5 * Y_MAX));
	}

	Point getPlanetPosition(Planet planet) {
		double radius = pos.radius(planet, null);
		double winkel = pos.laenge(planet, null);
		int x = (int) (radius * Math.cos(winkel) + mittelpunkt().x);
		int y = (int) (radius * Math.sin(winkel) + mittelpunkt().y);
		return new Point(x, y);
	}

	Image getImage(Planet planet) {
		Image img = null;
		try {
			String fileName = ASSET_PATH + planet.name() + IMAGE_MIME_TYPE;
			File file = new File(fileName);
			img = ImageIO.read(file);
		} catch (IOException e) {
			System.out.println(e);
		}
		return img;
	
	}

	private void zeichneKreis(Graphics g, int radius) {
		int x      = mittelpunkt().x - radius;
		int y      = mittelpunkt().y - radius;
		int width  = 2 * radius;
		int height = 2 * radius;
		g.drawOval(x, y, width, height);
	}

	// http://ephemeriden.com/planets.py?day=23&month=10&year=2012&hour=20&minute=44&second=44
	// http://ephemeriden.com/planets.py
	// http://de.wikipedia.org/wiki/Zeitgleichung
	private void zeichneUmlaufbahnen(Graphics g) {
		for (Planet planet : Planet.values()) {
			zeichneKreis(g, pos.radius(planet, new Date()));
		}
	}

	private void zeichneHimmelkörper(Graphics g, Planet planetFile, Point planetPosition) {
		g.drawImage(getImage(planetFile) , planetPosition.x, planetPosition.y, null);
	}
	
	private static void createAndShowGUI() {
		JFrame mainFrame = new JFrame("Kreis");
		mainFrame.getContentPane().add(new Leinwand( new PlanetenPosMock(), 750, 500));
		mainFrame.pack();
		mainFrame.setVisible(true);
	}

	public Dimension getPreferredSize() {
		return new Dimension(X_MAX, Y_MAX);
	}

	public Dimension getMinimumSize() {
		return getPreferredSize();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		zeichneUmlaufbahnen(g);
		for (Planet planet : Planet.values()) {
			zeichneHimmelkörper(g, planet, getPlanetPosition(planet));
		}
	}

	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		        createAndShowGUI();
		    }
		});
	}
}