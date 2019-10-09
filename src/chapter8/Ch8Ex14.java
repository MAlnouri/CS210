/* 
 * CS210 Ch8 Exercises 14, 15, 16
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.27 - Fall
 *
 */

package chapter8;
import java.awt.*;

public class Ch8Ex14 {
	
	public class Line {
		Point p1;
		Point p2;
		//constructs line of 2 points
		public Line(Point p1, Point p2) {
			this.p1 = p1;
			this.p2 = p2;
		}
		//returns the first point of the line
		public Point getP1() {
			return p1;
		}
		//returns the second point of the line
		public Point getP2() {
			return p2;
		}
		//returns the points of the line as a string
		public String toString() {
			return "[" + p1.toString() + ", " + p2.toString() + "]";
		}
		//Ex 15
		//returns the slope of the line
		public double getSlope() {
			//if the x coordinates are the same, throws exception
			if(p1.getX() == p2.getX()) {
				throw new IllegalStateException();
			}
			return (double)((p2.y - p1.y) / (p2.x - p1.x));
		}
		//Ex 16
		//constructs a new line with the given points
		public Line(int x1, int y1, int x2, int y2) {
			p1 = new Point();
			p2 = new Point();
			p1.setLocation(x1, y1);
			p2.setLocation(x2, y2);
		}
		Point a = new Point(22,33);
		Point b = new Point(22,55);
		Line test = new Line(a, b);
		
	}

	public static void main(String[] args) {
		
		

	}

}
