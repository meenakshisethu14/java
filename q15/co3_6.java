import java.util.Scanner;
interface Shape{
double area();
double perimeter();
}
class Circle implements Shape{
double radius;
Circle(double radius){
this.radius=radius;
}
public double area(){
return Math.PI*radius*radius;
}
public double perimeter(){
return 2*Math.PI*radius;
}
}
class Rectangle implements Shape{
double length;
double width;
Rectangle(double length,double width){
this.length=length;
this.width=width;
}
public double area(){
return length*width;
}
public double perimeter(){
return 2*(length+width);
}
}
public class co3_6{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int choice;
while(true){
System.out.println("\nMenu");
System.out.println("1.Calculate area and perimeter of the circle");
System.out.println("2.Calculate area and perimeter of rectangle");
System.out.println("3.Exit");
System.out.println("Enter your choice:");
choice=sc.nextInt();
switch(choice){
case 1:
System.out.print("Enter the radius:");
double radius=sc.nextDouble();
Circle c=new Circle(radius);
System.out.println("Area of circle:"+c.area());
System.out.println("Perimeter of circle:"+c.perimeter());
break;
case 2:
System.out.print("Enter length of the rectangle:");
double length=sc.nextDouble();
System.out.print("Enter width of the rectangle:");
double width=sc.nextDouble();
Rectangle r=new Rectangle(length,width);
System.out.println("Area of rectangle:"+r.area());
System.out.println("Perimeter of rectangle:"+r.perimeter());
break;
case 3:
System.out.println("Exiting program");
return;
default:
System.out.println("Invalid choice please try again");
}
}
}
}
