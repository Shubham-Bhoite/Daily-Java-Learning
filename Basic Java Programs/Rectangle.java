// Write a program to display the area and perimeter  of a rectangle with the width of 4.5 and height of 7.9 .

class Rectangle
{
	public static void main(String[] args) {
	double width = 4.5;
	double height = 7.9;
	double perimeter = 2*(width + height);
	double area = width * height;
	System.out.println("Area of rectangle is = " + area );
	System.out.println("Perimeter of rectangle is = " + perimeter);
	}	
}