/* 
 * CS210 Ch8 Exercises 18, 19, 20, 21, 22
 * Mahmmoud Alnouri
 * m.alnouri@bellevuecollege.edu
 * 2017.11.27 - Fall
 *
 */

package chapter8;
import java.awt.*;

public class Ch8Ex18 {

	public static void main(String[] args) {

		 class Rectangle {
			int x;
			int y;
			int width;
			int height;
			//constructs a rectangle with the x and y coordinates as a point, width and height
			public Rectangle(int x, int y, int width, int height) {
				//throws exception if width or height are negative
				if(width < 0 || height < 0) {
					throw new IllegalArgumentException();
				}
				this.x = x;
				this.y = y;
				this.width = width;
				this.height = height;
			}
			//returns the height
			public int getHeight() {
				return height;
			}
			//returns the width
			public int getWidth() {
				return width;
			}
			//returns the x coordinate
			public int getX() {
				return x;
			}
			//returns the y coordinate
			public int getY() {
				return y;
			}
			//returns the rectangle parameters as a string
			public String toString() {
				return "Rectangle[x = " + x + ", y = " + y + ", width = " + width + ", height = " + height + "]"; 
			}
			//Ex 19
			//constructs a rectangle with the given point, width and height
			public Rectangle(Point p, int width, int height) {
				this.x = (int) p.getX();
				this.y = (int) p.getY();
				this.width = width;
				this.height = height;
			}
			//Ex 20
			//returns true if the coordinates are within the rectangle
			public boolean contains(int x, int y) {
				return this.x <= x && x <= this.x + width && this.y <= y && y <= this.y + height;
			}
			//returns true if the point is within the rectangle
			public boolean contains(Point p) {
				return contains((int) p.getX(), (int) p.getY());
			}
			//Ex 21
			//returns a new rectangle that represents the area of a box that contains both rectangles
			public Rectangle union(Rectangle rect) {
				int boxX = Math.min(this.getX(), rect.getX());
				int boxY = Math.min(this.getY(), rect.getY());
				int boxW = Math.min(this.getWidth(), rect.getWidth());
				int boxH = Math.min(this.getHeight(), rect.getHeight());
				return new Rectangle(boxX, boxY, boxW, boxH);
			}
			//Ex 22
			//returns a new rectangle that represents region contained within both rectangles
			//returns width and height 0 if they do not intersect
			public Rectangle intersection(Rectangle rect) {
				int x1 = Math.max(this.x, rect.x);
		        int y1 = Math.max(this.y, rect.y);
		        int x2 = Math.min(this.x + this.width, rect.x + rect.width);
		        int y2 = Math.min(this.y + this.height, rect.y + rect.height);
		        int width = Math.max(0, x2 - x1);
		        int height = Math.max(0, y2 - y1);
		        
		        return new Rectangle(x1, y1, width, height);
			}
			
		}
		 //tests the methods
		 Point originOne = new Point(23, 94);
		 Rectangle rectOne = new Rectangle(originOne.x, originOne.y, 100, 200);
		 rectOne.toString();
		 rectOne.getHeight();

	}

}