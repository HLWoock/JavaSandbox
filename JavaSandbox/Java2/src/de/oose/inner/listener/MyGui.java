package de.oose.inner.listener;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyGui implements ActionListener {
	public static void main(String[] args) {
		MyGui gui = new MyGui();
		gui.showAll();
	}

	private void showAll() {
		// frame erzeugen
		JFrame frame = new JFrame("Java-2");
		frame.setBounds(0, 0, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		// button hinzufügen
		JButton button = new JButton("Press Me!");
		button.addActionListener(new MyListener());
		button.addActionListener(this);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("inner Listener");	
			}
		});
		panel.add(button);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("selber");
		
	}
}
