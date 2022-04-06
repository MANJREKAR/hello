import java.util.*;
public class Odd
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the integer value A: ");
    int a=sc.nextInt();
    for(int i=1;i<a;i++)
    {
      if(i%2==1)
        System.out.println(i+" ");
    }
  }
    
    
   
    
    
