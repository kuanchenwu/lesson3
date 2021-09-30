package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShapePanel {

	private JFrame window;
	private ShapeCanvas canvas;


	public ShapePanel(JFrame window){
		this.window = window;
	}

	public void init(){
		Container cp = window.getContentPane();
		JPanel southPanel = new JPanel();
		cp.add(BorderLayout.SOUTH, southPanel);

		JButton randomShapeButton = new JButton("Random Shapes");
		JButton exitButton = new JButton("Exit");
		southPanel.add(randomShapeButton);
		southPanel.add(exitButton);
		
		//canvas
		canvas = new ShapeCanvas(this);
		cp.add(BorderLayout.CENTER, canvas);
	}
	
}
