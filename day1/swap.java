import java.util.Scanner;
class a
{
int a,b,c;
void get(){
System.out.println("enter the value");
Scanner obj=new Scanner (System.in);
a=obj.nextInt();

b=obj.nextInt();
}
void swap(){
c=a;
a=b;
b=c;
}
void display()
{
System.out.println(a+" "+b);
}
}

class swap
{
public static void main(String args[])
{
a obj=new a();
obj.get();
obj.swap();
obj.display();
}
}