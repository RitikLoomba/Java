import java.util.*;
class cirqueue
{
	private int queuearray[];
	private int size;
	private int front,rear;
	private int pos;
	public cirqueue(int s)
	{   
	    size=s; 
	    queuearray=new int[size];
		front=-1;
		rear=-1;
        pos=0;	  	
	}
	public boolean isEmpty() 
	{
		if(front==-1&&rear==-1)
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
		if((front+1)%size==rear)
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
		else if(front==-1&&rear==-1)
		{
			front=0;
			queuearray[front]=a;
			rear=0;
			System.out.println(a+" added to queue at position "+(front+1));	
			System.out.println("FRONT -> "+front+" REAR -> "+rear);	
		}
		
		else 
		{
		  front=(front+1)%size;
          queuearray[front]=a;
		  
		 
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
		else if(rear==front)
		{
			t=queuearray[rear];
			pos=rear+1;
			rear=front=-1;
			return(t);
		}
		
		
		else
		{
			
			t=queuearray[rear];
			pos=rear+1;
			System.out.println("FRONT -> "+front+" REAR -> "+rear + pos);
			rear=(rear+1)%size;
				
				
			return(t);
		}
	}
	public int currentPosition()
	{
	 int p;
	   p=pos;
       return(p);
	   
	}
	public void displayQueuen()
	
	{    if(rear>front){
		int i=rear;
		while(i!=front)
		{
		System.out.println("Data at position"+(i+1)+" is "+queuearray[i]);
		i=(i+1)%size;
		}
	}
	else
		for(int i=rear;i<=front;i++)
		{
		System.out.println("Data at position"+(i+1)+" is "+queuearray[i]);
		rear++;
		}
	}
}
public class TheCircularQueue{
	public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Size");
    int size=s.nextInt();
	cirqueue obj=new cirqueue(size); 
	
	
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