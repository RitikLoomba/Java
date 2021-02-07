import java.util.Scanner;
class sort {
private int[] arr;
private int size;
int position;
 public sort(int s){
 size=s;
 arr=new int[size];
 position=0;
 }
 public void arrayData(int d){
 if(position<size){
 arr[position]=d;
 position++;}
 }
 public void sortArray(){
 int temp=0;
 for(int i=0;i<size-1;i++){
 for(int j=i+1;j<size;j++){
 if(arr[i]>arr[j])
 {
 temp=arr[i];
 arr[i]=arr[j];
 arr[j]=temp;
 }
 }
 }
 for(int i=0;i<size;i++){
 System.out.print(arr[i]+" ");

 }
  System.out.println();
 }
}
class bubbleSort{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter size");
int size=sc.nextInt();
sort obj=new sort(size);
int data ;
boolean flag=true;
while(flag==true){
System.out.println("Enter your choice");
System.out.println("1.Enter data");
System.out.println("2.Sort data");
System.out.println("3.Exit");
int choice=sc.nextInt();
switch(choice){
case(1):
{
	System.out.println("Enter data");
data=sc.nextInt();

obj.arrayData(data);
break;

}

case(2):
{
obj.sortArray();
break;
}
case(3):{
	flag=false;
	break;
}
}
}
}
}