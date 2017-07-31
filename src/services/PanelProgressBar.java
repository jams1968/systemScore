package services;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;



public class PanelProgressBar extends JPanel {
	private int valor_progress;
	
	public void ActualizarProgress(int valor_progress){
		this.valor_progress=valor_progress;
		
	}
	
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2=(Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.translate(this.getWidth()/2, this.getHeight()/2);
		g2.rotate(Math.toRadians(270));
		Arc2D.Float arc=new Arc2D.Float(Arc2D.PIE);
		Ellipse2D circulo=new Ellipse2D.Float(0, 0, 110,110);
		arc.setFrameFromCenter(new Point(0,0), new Point(120,120));
		circulo.setFrameFromCenter(new Point(0,0), new Point(110,110));		
		arc.setAngleStart(1);
		arc.setAngleExtent(-valor_progress*3.6);
		g2.setColor(Color.red);
		g2.draw(arc);
		g2.fill(arc);
		g2.setColor(Color.WHITE);
		g2.draw(circulo);
		g2.fill(circulo);
		g2.setColor(Color.red);
		g2.rotate(Math.toRadians(90));
		g.setFont(new Font("verdana", Font.PLAIN, 50));
		FontMetrics fm=g2.getFontMetrics();
		Rectangle2D r=fm.getStringBounds(valor_progress+"%", g);
		int x=(0-(int)r.getWidth())/2;
		int y=(0-(int)r.getHeight())/2+fm.getAscent();
			
		g2.drawString(valor_progress+"%", x,y);
		
	}

	//************ para ejecutarlo *********
	/*new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(int i=0;i<=100;i++){
				try {
					vista.getJpanelProgress().ActualizarProgress(i);
					vista.getJpanelProgress().repaint();
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
	}).start();*/

}
