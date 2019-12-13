import java.util.Scanner;
public class palindrome{
public static void main(String[] args)
{
int rev=0,rem,n,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter a num");
n=sc.nextInt();
temp=n;
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(temp==rev)
System.out.println("palindrome");
else
System.out.println("not pal");
}
}