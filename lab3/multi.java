/* Simple Program on Java for the implementation of Multiple inheritance using interfaces 
to calculate the area of a rectangle and triangle */

interface Shape{
  public void area();
}

class Dimension{
  private double width,height;
  Dimension(double w,double h)
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

class rectangle extends Dimension implements Shape{
  rectangle(double w,double h)
  {
    super(w,h);
  }
  public void area()
  {
    double h,w;
    h=getHeight();
    w=getWidth();
    double area=w * h;
    System.out.println("Area of a Rectangle is"+area);
    }
}

public class multi{
  public static void main(String[] args)
  {
    double ht,wt,hr,wr;
    
    //Scanner scan=new Scanner(System.in);
    //you can use scanner to make it more interactive
    
    System.out.println("Enter height of the triangle");
    ht=20;
    System.out.println("Enter width of the triangle");
    wt=20;
    System.out.println("Enter height of the rectangle");
    hr=30;
    System.out.println("Enter width of the rectangle");
    wr=30;
    
    triangle t=new triangle(wt,ht);
    rectangle r=new rectangle(wr,hr);
    
    t.area();
    r.area();
  }
}
