package asssignment3;

public class Circle extends Shape {
	
	int radius = 5;
	double pi = 3.14;
	double area;
	
	void Circle_area() {
		
		area = pi * radius * radius;
		System.out.println("Area of circle :" +area);
		
		
	}

}
