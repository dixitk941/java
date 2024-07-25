import java.util.Scanner;
class a
{
int a,b,c;
void get(int x,int y){
/*System.out.println("enter the value");
Scanner obj=new Scanner (System.in);
a=obj.nextInt();


b=obj.nextInt();*/
a=x;
b=y;
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

class swapnew
{
public static void main(String args[])
{
a obj=new a();
obj.get(5,6);
obj.swap();
obj.display();
}
}