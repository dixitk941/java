class input
{
int a,b,c;
void get()
{
a=10;
b=20;
c=a+b;
}
void display()
{
System.out.println(c);
}
}

class Vari
{
public static void main(String[] args)
{
input obj=new input();
obj.get();
obj.display();
}
}
