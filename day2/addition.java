import java.util.Scanner;
class a
{
double a,b,c;
void get(){
System.out.println("enter the value");
Scanner obj=new Scanner (System.in);
a=obj.nextDouble();
b=obj.nextDouble();

}
void add(){
c=a+b;
}
void display()
{
System.out.println(c);
}
}

class addition
{
public static void main(String args[])
{
a obj=new a();
obj.get();
obj.add();
obj.display();
}
}