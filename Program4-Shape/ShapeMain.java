import java.util.Scanner;
abstract class Shape
{
  int length,breadth;
void printArea()
{}
}
class Rectangle extends Shape
{
double areaR;
void printArea(){
areaR=(length*breadth);
System.out.println("The area of rectangle is "+areaR+" cm^2");
}
}
class Triangle extends Shape
{

double areaT;
void printArea(){
areaT=(0.5)*(length*breadth);
System.out.println("The area of Triangle is "+areaT+"cm^2");
}
}
class Circle extends Shape
{

double areaC;
void printArea(){
areaC=(3.14)*(length*length);
System.out.println("The area of circle is "+areaC+"cm^2");
}
}
class ShapeMain
{
public static void main(String args[])
{
Scanner A=new Scanner(System.in);
Rectangle R1=new Rectangle();
Triangle T1=new Triangle();
Circle C1=new Circle();
System.out.println("Enter the length and breadth of which u have to find the area of rectangle in cm\n"); 
R1.length=A.nextInt();
R1.breadth=A.nextInt();
System.out.println("Enter the length and breadth of which u have to find the area of triangle in cm\n");
T1.length=A.nextInt();
T1.breadth=A.nextInt();
System.out.println("Enter the length of which u have to find the area of circle in cm\n");
C1.length=A.nextInt();
R1.printArea();
T1.printArea();
C1.printArea();
}
}