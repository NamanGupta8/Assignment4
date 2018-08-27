import java.util.*;
class Complex{
int real,img;
void display(int r,int i){
System.out.println(r+"+"+"("+i+")"+"i");
}
}
public class ComplexNumber{

public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
Complex obj=new Complex();
obj.real=sc.nextInt();
obj.img=sc.nextInt();
obj.display(obj.real,obj.img);

}
}
