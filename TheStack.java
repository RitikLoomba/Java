
import java.util.*;
import java.util.Scanner;
class stack{
    private int size;
    private int stackarray[];
    private int top; 
     
     public stack(int s){
        size=s;
        stackarray=new int[size];
        top=-1;
     }
     public boolean isEmpty(){
		 if(top==-1){
			 return(true);
		 }
		 else{
			 return(false);
		 }
	 }
	 public boolean isFull(){
		 if(top==size-1){
			 return(true);
		 }
		 else{
			 return(false);
		 }
	 }
	 public void push(int a){
		 if(isFull()){
			 System.out.println("OVERFLOW");
		 }
		 else{
			   top++;
			   stackarray[top]=a;
			   System.out.println("Data "+a+" is added to stack at position "+(top+1));
			   
		 }
	 }
	 public int pop(){
		 int d;
		 if(isEmpty()){
			 System.out.println("UNDERFLOW OR EMPTY"); 
			 return -1;
		 }
		 else{
			 d=(stackarray[top]);
			
			 top--;
			 return d;
		 }
	 }
	 public int currentPosition(){
		 int y=top+2;
		 return(y);
	 }
}
class stringReverse{
	StringBuilder xx=new StringBuilder();
	private int size;
    private char stackarray1[];
    private int top;
	public stringReverse(int s){
        size=s;
        stackarray1=new char[size];
        top=-1;
     }
	 public String reverse(String sub){
		 
		 int l=sub.length();
		 top++;
		  char[] c1=sub.toCharArray();
		  for(int i=0;i<l;i++){
		  stackarray1[top]=c1[i];
		  top++;
		  }
		  top--;
		   for(int i=0;i<l;i++){
		  c1[i]=stackarray1[top];
		  top--;
		  
		 xx=xx.append(c1[i]);
		  }
		   
		  String s2=(xx.toString());
		  return(s2);
	 }
}
public class TheStack{
	public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Size");
    int size=s.nextInt();
	stack obj=new stack(size); 
	stringReverse obj1=new stringReverse(size);
	
	boolean flag=true;
	while(flag){
		System.out.println("1.PUSH data");
		System.out.println("2.POP data");
		System.out.println("3.Exit");
		System.out.println("4.Reverse"); 
		System.out.println("Enter your choice");
		int choice=s.nextInt();
		int data,position;
		String s1;
		boolean x;
		switch(choice)
		{
		case(1):
		{
			System.out.println("Enter your Data");
			data=s.nextInt();
			obj.push(data);
			break;
		}
		case(2):
		{
			
		    x=obj.isEmpty();
			data=obj.pop();
			
			if(x==false){
			position=obj.currentPosition();
			System.out.println("Data returned is "+data +" from position "+position);
			}
			break;
			
			
		}
		case(3):
		{
			
			flag=false;
			break;
		}
		case(4):
		{
		    System.out.println("Enter String you want to reverse");
			s1=s.next();
			s1=obj1.reverse(s1);
			
			System.out.println(s1);
			break;
			
		}
		
		
		}
		
	}
	}
	
}