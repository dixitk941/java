import java.util.Scanner;
class karan{
int a,b,c;

void get()
{

System.out.println("enter the value");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
b=obj.nextInt();
}

void greater(){
if(a >b){
System.out.println("a is greater than b");}

else{
System.out.println("b is greater");}
}
}

public class Main {
public static void main(String args[])
{
karan obj=new karan();
obj.get();
obj.greater();
}

}