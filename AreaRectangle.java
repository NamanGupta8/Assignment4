import java.util.*;
class Rectangle{
  int length,breadth;
  int calculateArea(int l,int b){
    return l*b;
  }
}
class AreaRectangle{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  Rectangle obj=new Rectangle();
  obj.length=sc.nextInt();
  obj.breadth=sc.nextInt();
  int x=obj.calculateArea(obj.length,obj.breadth);
  System.out.println("Area of rectangle is "+x+" units");
}
}
