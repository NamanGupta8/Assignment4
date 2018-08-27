import java.util.*;
class SecondLargestElement{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,max,max2;
n=sc.nextInt();
int a[]=new int[n+1];
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
max=a[0];
for(i=0;i<n;i++){
if(a[i]>max)
max=a[i];
}
max2=a[0];
for(i=0;i<n ;i++){
if(max2<a[i] && a[i]!=max){
max2=a[i];
}
}
System.out.println("Second largest element is "+max2);
}
}
