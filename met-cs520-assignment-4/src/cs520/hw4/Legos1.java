package cs520.hw4;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Legos1 extends JFrame {
	
	private int startX;
	private int startY;
	private int legoWidth;
	private int legoHeight;
	private int baseLength;
	
	public Legos1() {
	
		super("Hornicek's Legos");
	
	startX=20;
	startY=300;
	legoWidth=50;
	legoHeight=20;
	baseLength=10;
	}	
public void paint(Graphics g) {
	for(int i=0; i <= baseLength; i++) {
		g.setColor
		g.fillRoundRect(startX,startY,legoWidth,legoHeight,2,2);
	}
}
	

public static void main(String[] args) {
	
	Legos1 app = new Legos1();
	app.setSize(550,325);
	app.setVisible(true);
	app.paint(g);
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
}
}