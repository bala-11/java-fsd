package MethodsAndCalls;

public class MethodOverloading {
	//multiple methods in same name
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h)+"  Sq.meter");
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r)+"  Sq.meter");
    }

    public static void main(String args[])
   {

       MethodOverloading ad = new MethodOverloading();
       //passing the values
       ad.area(20,10);
       ad.area(12);  
   }
}

