package asssignment3;

public class Triangle extends Shape {
	
	int heigth = 7;
	int base = 4;
	double area;
	
	void Triangle_area() {
		
		area = heigth * base /2 ;
		System.out.println("Area of Triangle :" +area);

}
}