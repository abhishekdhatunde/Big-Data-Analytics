package q1;

import java.util.Scanner;

public class Tester 
{
  public static void main(String[] args) 
  {

    Scanner sc = new Scanner(System.in);
    Fixedstack ref1 = null;
    Growablestack ref2 = null;
    boolean selected = false;
    boolean exit = false;
    while(!exit)
    {
      System.out.println("------- Menu -------");
      System.out.println(" 1. Fixed Stack \n 2. Growable Stack");
      System.out.println(" 3. Push Data \n 4. Pop Data \n 5. Display \n 6. Exit");
      System.out.println();
      System.out.println("Enter your Choice");
      switch(sc.nextInt())
      {
        case 1:
        {
          if(selected == false)
          {
             ref1 = new Fixedstack();
             selected = true;
             break;
          }
          else
          {
            System.out.println("Sorry, Stack already choosen");
            break;
          }
            
            
        }
        case 2:
        {
          if(selected == false)
          {
             ref2 = new Growablestack();
             selected = true;
             break;
          }
          else
          {
            System.out.println("Sorry, Stack already choosen");
            break;
          }
        }
        case 3:
        {
          if(ref1 != null && ref2 == null)
          {
            employee e = new employee();
            e.accept();
            ref1.push(e);
            break;
          }
          else
          {
            employee e = new employee();
            e.accept();
            ref2.push(e);
            break;
          }
          
        }
        case 4:
        {
          if(ref1 != null && ref2 == null)
          {
  
            System.out.println("Popped Data is: "+ref1.pop());
            break;
          }
          else
          {
            
            System.out.println("Popped Data is: "+ref2.pop());
            break;
            
          }
        }
        case 5:
        {
          if(ref1 != null && ref2 == null)
          {
            ref1.display();
            break;
          }
          else
          {
            ref2.display();
            break;
          }
        }
        case 6:
          exit = true;
          break;
        
        
      }
      
      
    }
    
  }
}