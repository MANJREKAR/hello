import java.util.*;
public class Integer
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Interger A :");
int a=sc.nextInt();
for(int i=1;i<=a;i++)
{
if(i%2==1)
System.out.print(i+" ");
}
}
}
