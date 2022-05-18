package package3;
import java.util.Scanner;
// find area of different shapes 
// through abstraction we will enforce method overriding
abstract class Shapes{ //parent -- abstract class   
	double area;   
	abstract void getData1();void getData2() {
		// TODO Auto-generated method stub
		
	}
	void calculate() {
		// TODO Auto-generated method stub
		
	}
	//used for fetching the information   
	abstract void calculate1();//used for calculating the area   
	void disp()
	{         System.out.println("The area is :"+area);   
	} } 
class Circle extends Shapes
{     float r;//radius    
float pi = 3.147f;
private float side;    
@Override    
void calculate1()
{         area = pi * r * r;
}

@Override
void getData1()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius:");
    r = sc.nextFloat();
}


  class Square extends Shapes
{     float side;//side  

@Override    
void getData2()
{         Scanner sc = new Scanner(System.in);      
System.out.println("Enter the side:");      
 side = sc.nextFloat();  
}
@Override    
void calculate() 
{         area = side * side;    
}
@Override
void getData1() {
	// TODO Auto-generated method stub
	
}
@Override
void calculate1() {
	// TODO Auto-generated method stub
	
} 
}
 class Rectangle extends Shapes
{     float l,b;//length and breadth   
@Override    
void getData1()
{         Scanner sc = new Scanner(System.in);   
System.out.println("Enter the length:");     
l = sc.nextFloat();
    System.out.println("Enter the breadth:");
    b = sc.nextFloat();
}
@Override
void calculate() {
    area = l * b;
}
@Override
void calculate1() {
	// TODO Auto-generated method stub
	
}
}
class Geometry
{
	void  usage(Shapes s)
	{
	s.getData1();
	s.calculate();
	s.disp();
}}
	
	

public class LaunchSHapes
{
	 public static void main(String[] args) 
	 {
	        Circle c = new Circle();
	        Rectangle rc = new Rectangle();
	        Square sq = new Square();
	        
	        Shapes s;
	        s=c;
	        s.getData1();//overridden method
	        s.calculate1();//overridden method
	        s.disp();//inherited method
	        
	        s=rc;
	        s.getData1();//overridden method
	        s.calculate();//overridden method
	        s.disp();//inherited method
	        
	        s=sq;
	        s.getData1();//overridden method
	        s.calculate();//overridden method
	        s.disp();//inherited method
	        
	  Geometr

	







