package de.oose.compare;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import de.oose.compare.util.Reihenfolge;

public class DemoCollectionsSort {

	public static void main(String[] args) {
		List<Color> farben = new ArrayList<Color>();
		farben.add(Color.BLACK);
		farben.add(Color.LIGHT_GRAY);
		farben.add(Color.WHITE);
		farben.add(Color.DARK_GRAY);
		
		System.out.println(farben);
		
		Comparator<Color> vergleicher = new VergleicherHelligkeit(Reihenfolge.AUFSTEIGEND);
		
		//sort
		Collections.sort(farben, vergleicher);
		
		System.out.println(farben);
		
		zeigeFarbenInFenster(farben);
	}

	public static void zeigeFarbenInFenster(Collection<Color> farben) {
		JFrame fenster = new JFrame(farben.size()+" Farben");
		JPanel leinwand = new JPanel(new FlowLayout());
		fenster.setContentPane(leinwand);

		for (Color color : farben) {
			JPanel quadrat = new JPanel();
			String beschriftung = String.format("(%02x,%02x,%02x)", color.getRed(), color.getGreen(), color.getBlue());
			quadrat.add(new JLabel(beschriftung));
			
			quadrat.setBackground(color);
			quadrat.setPreferredSize(new Dimension(90, 45));
			leinwand.add(quadrat);
		}

		fenster.setBounds(20, 20, 640, 480);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setVisible(true);
	}

}
