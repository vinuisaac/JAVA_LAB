package shape;

public class square
{
  public void sq(int a)
  {
    System.out.println("Are if the square"+(a*a));
  }
}

package shape;


public class circle
{
  public void cir(int r)
  {
    System.out.println("Area of the circle="+(3.14*r*r));
  }
}

package shape;

public class triangle
{
  public void tri(int w,int h)
  {
    System.out.println("Area of the triangle"+(0.5*w*h));
  }
}

package shape;

public class PackDemo{
    public statc void man(String[] args){
      square s=new square();
      s.sq(6);
      
      triangle t=new triangle();
      t.tri(10,5)
      
      circle cr=new circle();
      cr.cir(7);
    }
}

