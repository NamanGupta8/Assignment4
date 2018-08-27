class abc{
static int i;
abc(int x){
super();
i=x;
System.out.println(i);
}
static{

System.out.println("This is a static block");
 }
}
class staticBlock{
public static void main(String args[]){
abc obj=new abc(10);

 }
}
