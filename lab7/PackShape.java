package Shape;
public class square{
	public void sq(int a)
	{
		System.out.println("Area of the square="+(a*a));
	}
}

package Shape;
public class circle{
	public void circle(int r)
	{
		System.out.println("Area of the circle="+(3.142*r*r));
	}
}

package Shape;
public class triangle{
	public void triangle(int w,int h)
	{
		System.out.println("Area of triangle"+(0.5*w*h));
	}
}

package Shape;
import shape.*;

public class PackShape{
	public static void main(String[] args)
	{
		square s=new square();
		s.sq(6);
		
		triangle t=new triangle();
		t.tri(10,5);
		
		circle c=new circle();
		c.cir(7);
	}
}
