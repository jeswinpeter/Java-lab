package matrix;

//----- Superclass Shapes -----
abstract class Shapes {
	abstract void numberOfSides();
}


//----- Subclass Triangle -----
class Triangle extends Shapes {
	int side;
	
	Triangle(int side) {		//Triangle constructor
		this.side = side;
	}
	
	//Overriding method numberOfSide 
	void numberOfSides() {
		System.out.println("I am Triangle, Number of sides = " + side);
	}
}


//----- Subclass Rectangle -----
class Rectangle extends Shapes {
	int side;
	
	Rectangle(int side) {		//Rectangle constructor
		this.side = side;
	}
	
	//overriding method numberOfSide
	void numberOfSides() {
		System.out.println("I am Rectangle, Number of sides = " + side);
	}
}


//----- Subclass Hexagon -----
class Hexagon extends Shapes {
	int side;
	
	Hexagon(int side) {			//Hexagon constructor
		this.side = side;
	}
	
	//overriding method numberOfSide
	void numberOfSides() {
		System.out.println("I am Hexagon, Number of sides = " + side);
	}
}


public class AbstactClass {
	public static void main(String[] Abs) {
		
		//Creating objects for Subclasses
		Triangle tri = new Triangle(3);
		Rectangle rect = new Rectangle(4);
		Hexagon hex = new Hexagon(6);
		
		//Calling numberOfSide method using objects of subclasses
		tri.numberOfSides();
		rect.numberOfSides();
		hex.numberOfSides();
	}
}
