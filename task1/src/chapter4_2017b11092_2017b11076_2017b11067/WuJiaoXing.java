package chapter4_2017b11092_2017b11076_2017b11067;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel{
	public void paintComponent(Graphics g) {
		int xPoints[]= {239,180,52,146,124,238,353,332,423,295};
		int yPoints[]= {75,194,215,312,446,383,445,311,218,197};
		g.setColor(Color.red);
		g.fillPolygon(xPoints,yPoints,10);
		//g.drawPolygon(xPoints,yPoints,10);
	}
}
public class WuJiaoXing extends JFrame{
	WuJiaoXing(){
		this.setTitle("Îå½ÇÐÇ");
		this.setSize(500,500);
		this.setVisible(true);
		this.getContentPane().add(new MyPanel());
	}
	public static void main(String[] args) {
		new WuJiaoXing();
	}
	
}