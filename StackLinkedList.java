import java.util.*;
class Node1{
private int Data;
private Node Next;

public Node1(){
Data=0;
Next=null;
}
public Node1(int d,Node n){
Data=d;
Next=n;
}
public void setData(int d){
Data=d;
}
public void setNext(Node n){
Next=n;
}
public int getData(){
return(Data);
}
public Node getNext(){
return(Next);
}
}
class stack11{
private int size;
private Node start;
public stack11(){
 size=0;
 start=null;
}
public boolean isEmpty(){
if(start==null){
return(true);
}
else{
return(false);}
}
public void pushData(int a)
{
Node x;
Node t=new Node();
t.setData(a);
if(isEmpty()) {
t.setNext(null);  
start=t;
size++;
}
else {
x=start;
for(int i=1;i<size;i++){
x=x.getNext();
}

x.setNext(t);

size++;

}
System.out.println("Data "+ a+ " is pushed into stack at position "+size);
}
public int popData(){
	int a;
if(isEmpty()){
System.out.println("UNDERFLOW OR EMPTY");
return -1;
}
else if(size==1){
	int d1;
	d1=start.getData();
	start=null;
	size--;
	return(d1);
}
else{
	Node x=start;
int d1;
Node x1;
for(int i=1;i<size-1;i++){
x=x.getNext();
}
x1=x.getNext();
d1=x1.getData();
x.setNext(null);
size--;
return d1;
}
}
public int currentSize(){
	int p=size+1;
return(p);
}

}
public class StackLinkedList{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
stack11 obj=new stack11();

boolean flag=true;
while(flag){
System.out.println("1. PUSH Data");
System.out.println("2. POP Data");
System.out.println("3. Exit");
System.out.println("Enter Your Choice");
int choice=s.nextInt();
int data,position;
boolean y;
switch(choice){
case(1):
{
System.out.println("Enter Data");
data=s.nextInt();
obj.pushData(data);
break;
}
case(2):
{
y=obj.isEmpty();
data=obj.popData();
if(y==false){
position=obj.currentSize();
System.out.println("Data "+ data+ " is poped from stack from  position "+position);
}
break;
}
case(3):

{
flag=false;
break;
}
}

}

}

}
















