/* Simple Program on Java for the implementation of Multiple inheritance using interfaces 
to calculate the area of a rectangle and triangle */

public interface Shape{
  public void area();
}

import java.util.Scanner;

class Dimensions{
  private double width,height;
  dimensions(double w,double h)
  {
    width=w;
    height=h;
  }
  public double getWidth()
  {
    return width;
  }
  public double getHeight()
  {
    return height;
  }
}

class triangle extends Dimension implements Shape{
  triangle(double w,double h)
  {
    super(w,h);
  }
  public void area()
  {
    double h,w;
    h=getHeight();
    w=getWidth();
    double area=0.5 * w * h;
    System.out.println("Area of a Triangle is"+area);
    }
}

class rectanlge extends Dimension implements Shape{
  rectangle(double w,double h)
  {
    super(w,h);
  }
  public void area()
  {
    double h,w;
    h=getHeight();
    w=getWidth();
    double area=w * h
    System.out.println("Area of a Rectangle is"+area);
    }
}

public class Multi{
  public static void main(String[] args)
  {
    double ht,wt,hr,wr;
    Scanner scan=new Scanner(System.in);
    
    triangle t=new triangle();
    rectangle r=new rectangle();
    
    System.out.println("Enter height of the triangle");
    ht=scan.nextInt();
    System.out.println("Enter width of the triangle");
    wt=scan.nextInt();
    System.out.println("Enter height of the rectangle");
    hr=scan.nextInt();
    System.out.println("Enter width of the rectangle");
    wr=scan.nextInt();
    
    t.area();
    r.area();
  }
}
