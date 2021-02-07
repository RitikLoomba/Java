import java.util.*;
class queue
{
	private int queuearray[];
	private int size;
	private int front,rear;
	public queue(int s)
	{   
	    size=s;
	    queuearray=new int[size];
		front=-1;
		rear=-1; 
	}
	public boolean isEmpty() 
	{
		if(front==-1||rear==-1||rear>front)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	public boolean isFull() 
	{
		if(front==size-1&&rear==0)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	public void enQueue(int a)
    {
	    if(isFull())
		{
		
		System.out.println(a+" cannot be added to queue overload");	
		System.out.println("FRONT -> "+front+" REAR -> "+rear);	
		}
		else if(isEmpty())
		{
			front++;
			queuearray[front]=a;
			rear++;
			System.out.println(a+" added to queue at position "+(front+1));	
			System.out.println("FRONT -> "+front+" REAR -> "+rear);	
		}
		else
		{
		  front++;
          queuearray[front]=a;
		  rear=0;
		 
		  System.out.println(a+" added to queue at position "+(front+1));
		  System.out.println("FRONT -> "+front+" REAR -> "+rear);	
		}
	}
	public int deQueue()
	{    
	   int t; 
		if(isEmpty())
		{
		System.out.println("Queue empty");
		System.out.println("FRONT -> "+front+" REAR -> "+rear);	
        return -1;		
		}
		else
		{
			
			t=queuearray[rear];
			System.out.println("FRONT -> "+front+" REAR -> "+rear);
			rear++;
				
				
			return(t);
		}
	}
	public int currentPosition()
	{
	   int p;
       p=rear;	
       return(p);
	   
	}
	public void displayQueuen()
	{
		for(int i=rear;i<=front;i++)
		{
		System.out.println("Data at position"+(i+1)+" is "+queuearray[i]);
		}
	}
}
public class TheQueue{
	public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Size");
    int size=s.nextInt();
	queue obj=new queue(size); 
	
	
	boolean flag=true;
	while(flag){
		System.out.println("1.ENQUEUE data");
		System.out.println("2. DEQUEUE data");
		System.out.println("3.Exit");
		System.out.println("4. DISPLAY QUEUE data");
		System.out.println("Enter your choice");
		int choice=s.nextInt();
		int data,position;
		
		boolean x;
		switch(choice)
		{
		case(1):
		{
			System.out.println("Enter your Data");
			data=s.nextInt();
			obj.enQueue(data);
			break;
		}
		case(2):
		{
			
		    x=obj.isEmpty();
			data=obj.deQueue();
			
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
			
			obj.displayQueuen();
			break;
		}
		
		
		}
		
	}
	}
	
}