import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
public class SimpleGUI extends JPanel{
	//*
	public static enum Figure {
		MY_LAST_NAME, LINE, OVAL, RECT, ROUNDRECT, CLEAR
	};
	private Figure vibor = Figure.CLEAR;
	public SimpleGUI(){}
	public void ris(String s) {
		vibor=Figure.valueOf(s);
		repaint();
	}
	public void paintComponent(Graphics gr){
		super.paintComponent(gr);
		Graphics2D g = (Graphics2D)gr;
		BasicStroke pen;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		switch (vibor){
			case LINE:
			pen=new BasicStroke(20,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
			g.setStroke(pen);//делаем текущим пером созданное нами
			g.setColor(Color.blue);//задаем цвет пера
			g.drawLine(20, 20, 100, 100);
			break;
		case OVAL:
			float[] dash = {10, 30};
			pen=new BasicStroke(10,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_ROUND,10, dash,0);
			g.setStroke(pen);
			g.setColor(Color.red);
			g.setPaint(new GradientPaint(30, 30, Color.red, 50, 50, Color.green, true));
			g.fill(new Ellipse2D.Double(20, 20, 100, 100));
			break;
		case RECT:
			float[] dash2 = {20, 20};
			pen=new BasicStroke(5,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_BEVEL,1, dash2,0);
			g.setStroke(pen);
			g.setColor(Color.magenta);
			g.drawRect(20, 20, 100, 100);
			break;
		case ROUNDRECT:
			float[] dash3 = {20, 20,2,20,2,20};
			pen=new BasicStroke(10,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL,1, dash3,0 );
			g.setStroke(pen);
			g.setColor(Color.yellow);
			g.drawRoundRect(20, 20, 100, 100,60,60);
			break;
		case MY_LAST_NAME:
			g.clearRect(0, 0, getSize().width, getSize().height);
			pen=new BasicStroke(5,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL);
			g.setStroke(pen);
//Р
			pen = new BasicStroke(10,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL);
			g.setStroke(pen);
			g.setColor(Color.RED);
			g.drawLine(120, 10, 120, 75);
			g.drawLine(120, 10, 150, 10);
			g.drawLine(120, 40, 150, 40);
			g.drawLine(150, 10, 150, 40);
//А
			g.setColor(Color.YELLOW);
			g.drawLine(170, 75, 190, 10);
			g.drawLine(190, 10, 210, 75);
			g.drawLine(175, 50, 205, 50);
//И
			g.setColor(Color.GREEN);
			g.drawLine(230, 10, 230, 75);
			g.drawLine(230, 75, 260, 10);
			g.drawLine(260, 10, 260, 75);
//М
			g.setColor(Color.BLUE);
			g.drawLine(250, 90, 250, 150);
			g.drawLine(250, 90, 270, 150);
			g.drawLine(270, 150, 290, 90);
			g.drawLine(290, 90, 290, 150);
//O
			g.setStroke(pen);
			g.setColor(Color.BLACK);
			g.setPaint(new GradientPaint(30, 30, Color.black, 50, 50, Color.blue, true));
			g.fill(new Ellipse2D.Double(275, 5, 35, 75));
//B
			pen = new BasicStroke(7,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL);
			g.setStroke(pen);
			g.setColor(Color.RED);
			g.drawOval(320,10, 30, 33);
			g.drawOval(320,42, 30, 33);
			g.clearRect(323, 20, 10, 40);
			g.drawLine(320, 10, 320, 75);
			break;
		case CLEAR:
			g.clearRect(0, 0, getSize().width, getSize().height);
			break;
		}
	}
}
