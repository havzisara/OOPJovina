package geometry;


public class Donut extends Circle {
	private int innerR;

	public double area() {
		return super.area() - innerR * innerR * Math.PI;
	}


	@Override
	// Center:(xCenter,yCenter), radius = <radius>, inner radius = <radius>
	public String toString() {
		return super.toString() + ", inner radius = " + innerR;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Donut) {
			/*Donut temp = (Donut) obj;
			if (center.equals(temp.center) && innerR == temp.innerR && r == temp.r) {
				return true;
			}*/
			
			Donut temp = (Donut) obj;
			if (super.equals(new Circle(temp.center, temp.r)) && innerR == temp.innerR) {
				return true;
			}
		}
		return false;
	}
	
	public int getInnerR() {
		return innerR;
	}
	
	public void setInnerR(int innerR) {
		this.innerR = innerR;
	}
}