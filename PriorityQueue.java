import java.util.*;
class priorityqueue
{
	private int queuearray[];
	private int size;
	private int position;
	public priorityqueue(int s)
	{   
	    size=s;
	    queuearray=new int[size];
		position=0;
	}
	public boolean isEmpty() 
	{
		if(position==0)
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
		if(position==size)
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
		System.out.println("POSITION : "+position);	
		}
		else if(isEmpty())
		{
			
			queuearray[position]=a;
			position++;
			System.out.println(a+" added to queue at position "+position);	
			
		}
		else
		{ 
		    int i;
	      for( i=position-1;i>=0;i--){
		  if(queuearray[i]<a)
		  {
		    queuearray[i+1]=queuearray[i];
			
		    
		  }
		  else
		  {
		  break;
		  }
		  }
		  queuearray[i+1]=a;
		  position++; 
		  System.out.println(a+" added to queue at position "+position);
		  }
		 
		  
		
		
	}
	public int deQueue()
	{    
	   int t; 
		if(isEmpty())
		{
		System.out.println("Queue empty");
	    System.out.println("POSITION : "+position);	
        return -1;		
		}
		else
		{
			
			t=queuearray[position-1];
			System.out.println("POSITION : "+position);	
			position--;
				
				
			return(t);
		}
	}
	public int currentPosition()
	{
	   int p;
       p=position+1;	
       return(p);
	   
	}
	public void displayQueuen()
	{
		for(int i=1;i<=position;i++){
			System.out.println(queuearray[i-1]+" is returned from position "+i);
		}
	}
}
public class PriorityQueue{
	public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Size");
    int size=s.nextInt();
	priorityqueue obj=new priorityqueue(size); 
	
	
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

 