package lab05;

import javax.swing.JFrame;

public class ShapeViewer {

	public static void main(String[] args) {
		
		// use this frame object to add 2D objects to
		JFrame frame = new JFrame();
		
		// configure your frame's size, title, and close operation
		frame.setSize(600, 600);			// TODO CHANGE THE WINDOW SIZE
		frame.setTitle("CS 203 Lab 5");		// TODO CHANGE THE WINDOW TITLE
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// add objects into your frame
		ShapeComponent s = new ShapeComponent();
		frame.add(s);

		// lastly, set your frame visibility to true
		frame.setVisible(true);
	}
}