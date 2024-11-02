package asssignment3;

public class Rectangle extends Shape{
	
	int length = 5;
	int width = 4;
	double area;
	
	void Rectangle_area() {
		
		area = length * width;
		System.out.println("Area of Rectangle :" +area);
	}

}
