import java.util.*;
class WaveForm{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),i,temp;
int a[]=new int[n+1];
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(i=0;i<n;i++){
  if(i==n-1){
    break;
  }
if((i+1)%2!=0){
temp=a[i];
a[i]=a[i+1];
a[i+1]=temp;
}
}
for(i=0;i<n;i++){
System.out.print(a[i]+" ");
}
System.out.println();
}
}
