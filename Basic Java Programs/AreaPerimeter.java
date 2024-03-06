// Write a program to display  the area and perimeter of a circle whose radius is 5.5cm.

class AreaPerimeter
{
	public static void main(String[] args) {
	double radius = 5.5;
	final double pi = 3.14;
	double area = pi*(radius*radius);
	double perimeter = 2* pi*radius;
	System.out.println("Area of circle is = " + area + "cm^2" );
	System.out.println("Perimeter of circle = " + perimeter);
	}	
}