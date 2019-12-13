class argdemo{
public static void main(String[] args)
{
System.out.println("the following arguments are passed during runtime");
System.out.println(args[0]);
System.out.println(args[1]);
System.out.println(args[2]);
int first,second,sum;
first=Integer.parseInt(args[3]);
second=Integer.parseInt(args[4]);
sum=first+second;
System.out.println("sum of two num is"+sum);
}
}
