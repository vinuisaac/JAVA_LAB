/* Write a java program which has 
  1. A interface class for stack operations
  2. A class that implements the stack interface & creates a fixd length stack
  3. A class that implements the stack interface & creates a dynamic length stack
  4. A class that uses both the above stacks through interface reference & does the run time binding */
  
  
  
  interface IntStack{
    void Push(int item);
    int pop();
    }
    
    class FixedStack
