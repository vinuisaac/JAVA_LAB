/* Write a java program which has 
  1. A interface class for stack operations
  2. A class that implements the stack interface & creates a fixd length stack
  3. A class that implements the stack interface & creates a dynamic length stack
  4. A class that uses both the above stacks through interface reference & does the run time binding */
  
  
  
  interface IntStack{
    void Push(int item);
    int pop();
    }
    
    import java.util.*;   
    
    class FixedStack implements IntStack{
      private int stack[];
      private int tos;
      FixedStack(int size)
      {
        stck=new int[size];
        tos=-1;
      }
      public void push(int item)
      {
        if(tos==stck.length-1)
        System.out.println("Stack if full");
        else
        stck[++tos]=item;
      }
      public int pop()
      {
        if(tos<0)
        {
          System.out.println("Stack underflow");
          return 0;
        }
        else
        return stck[tos--];
      }
    }
    
    class DynStack implements IntStack{
      private int stck[];
      private int tos;
      Dynstack(int size)
      {
        stck=new int[size];
        tos=-1;
      }
      public void push(int item)
      {
        if(tos==stck.length-1)
        {
          int temp[]=new int[stck.length * 2];
          for(int i=0;i<stck.length;i++)
          temp[i]=stck[i];
          stck=temp;
          stck[++tos]=item;
        }
        else
        stck[++tos]=item;
      }
      public int pop()
      {
        if(tos<0)
        {
          System.out.println("Stack Underflow");
          return 0;
        }
        else
        return stck[tos--];
      }
    }
    
    class IFTest{
      public static void main(String[] args)
      {
        //Fixed Stack
        
        System.out.println("Enter the size of Fixed Stack");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        FixedStack fs=new FixedStack(a);
        
        for(int i=0;i<a;i++)
        fs.push(i);
        
        System.out.println("The Contents of the Fixed Stack are:");
        for(int i=0;i<a;i++)
        System.out.println(fs.pop());
        
        //Dynamic stack
        
        DynStack ds=new DynStack(8);
        for(int i=0;i<20;i++)
        ds.push(i);
        
        System.out.println("The contents of the Dynamic Stack are:");
        for(int i=0;i<20;i++)
        System.out.println(ds.pop());

      }
    }
