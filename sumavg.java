import java.util.Scanner;
class sumavg{
public static void main(String[] args)
{
int a,b,c,sum;
 float avg;
Scanner s=new Scanner(System.in);
System.out.println("enter 3 num");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
sum=a+b+c;
avg=(float)sum/3;
System.out.println("sumof 3 num is"+sum);
System.out.println("avg of 3 num is"+avg);
}
}
