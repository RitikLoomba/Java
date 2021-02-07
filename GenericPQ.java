import java.util.*;
class genericpq<E>
{
	private E queuearray[];
	private int size;
	private int position;
	public genericpq(int s)
	{   
	    size=s;
	   E[] queuearray=(E[])(Object E[size]);
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
	public void enQueue(E a)
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
		  if(queuearray[i].toString().compareTo(a.toString())>0)
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
	public E deQueue()
	{    
		E t; 
		if(isEmpty())
		{
		System.out.println("Queue empty");
	    System.out.println("POSITION : "+position);	
        return(null);		
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
       p=position;	
       return(p);
	   
	}
	public void displayQueuen()
	{
		for(int i=1;i<=position;i++){
			System.out.println(queuearray[i-1]+" is returned from position "+i);
		}
	}
}
public class GenericPQ{
	public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Size");
    int size=s.nextInt();
	genericpq<Integer> obj=new genericpq<Integer>(size); 
	genericpq<String> obj1=new genericpq<String>(size); 
	genericpq<Character> obj2=new genericpq<Character>(size); 
	genericpq<Float> obj3=new genericpq<Float>(size); 
	genericpq<Double> obj4=new genericpq<Double>(size); 
	boolean flag=true; 
	while(flag){
		System.out.println("1.INTERGER QUEUE");
		System.out.println("2.STRING QUEUE");
		System.out.println("3.CHAR QUEUE");
		System.out.println("4. FLOAT QUEUE");
		System.out.println("5. DOUBLE  QUEUE");
		System.out.println("6. EXIT");
		System.out.println("Enter your choice");
		int choice=s.nextInt();
		
		switch(choice)
		{
		case(1):
		{ 
		   	boolean temp=true; 
	while(temp){
		System.out.println("1.ENQUEUE data");
		System.out.println("2. DEQUEUE data");
		System.out.println("3.Exit");
		System.out.println("4. DISPLAY QUEUE data");
		System.out.println("Enter your choice");
		int c=s.nextInt();
		int position;
		Integer data;
		boolean x;
		switch(c)
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
			
			temp=false;
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
		case(2):
		{ 
		   	boolean temp=true; 
	while(temp){
		System.out.println("1.ENQUEUE data");
		System.out.println("2. DEQUEUE data");
		System.out.println("3.Exit");
		System.out.println("4. DISPLAY QUEUE data");
		System.out.println("Enter your choice");
		int c=s.nextInt();
		int position;
		String data;
		boolean x;
		switch(c)
		{
		case(1):
		{
			System.out.println("Enter your Data");
			data=s.nextLine();
			obj1.enQueue(data);
			break;
		}
		case(2):
		{
			
		    x=obj1.isEmpty();
			data=obj1.deQueue();
			
			if(x==false){
			position=obj.currentPosition();
			System.out.println("Data returned is "+data +" from position "+position);
			}
			break;
			
			
		}
		case(3):
		{
			
			temp=false;
			break;
		}
		case(4):
		{
			
			obj1.displayQueuen();
			break;
		}
		
		
		}
		
	} 
		
		}
	
		case(3):
		{ 
		   	boolean temp=true; 
	while(temp){
		System.out.println("1.ENQUEUE data");
		System.out.println("2. DEQUEUE data");
		System.out.println("3.Exit");
		System.out.println("4. DISPLAY QUEUE data");
		System.out.println("Enter your choice");
		int c=s.nextInt();
		int position;
		Character data;
		boolean x;
		switch(c)
		{
		case(1):
		{
			System.out.println("Enter your Data");
			data=s.next().charAt(0);
			obj2.enQueue(data);
			break;
		}
		case(2):
		{
			
		    x=obj2.isEmpty();
			data=obj2.deQueue();
			
			if(x==false){
			position=obj2.currentPosition();
			System.out.println("Data returned is "+data +" from position "+position);
			}
			break;
			
			
		}
		case(3):
		{
			
			temp=false;
			break;
		}
		case(4):
		{
			
			obj2.displayQueuen();
			break;
		}
		
		
		}
		
	} 
		
		}
	
	case(4):
		{ 
		   	boolean temp=true; 
	while(temp){
		System.out.println("1.ENQUEUE data");
		System.out.println("2. DEQUEUE data");
		System.out.println("3.Exit");
		System.out.println("4. DISPLAY QUEUE data");
		System.out.println("Enter your choice");
		int c=s.nextInt();
		int position;
		Float data;
		boolean x;
		switch(c)
		{
		case(1):
		{
			System.out.println("Enter your Data");
			data=s.nextFloat();
			obj3.enQueue(data);
			break;
		}
		case(2):
		{
			
		    x=obj4.isEmpty();
			data=obj3.deQueue();
			
			if(x==false){
			position=obj3.currentPosition();
			System.out.println("Data returned is "+data +" from position "+position);
			}
			break;
			
			
		}
		case(3):
		{
			
			temp=false;
			break;
		}
		case(4):
		{
			
			obj3.displayQueuen();
			break;
		}
		
		
		}
		
	} 
		
		}
	
	/case(5):
		{ 
		   	boolean temp=true; 
	while(temp){
		System.out.println("1.ENQUEUE data");
		System.out.println("2. DEQUEUE data");
		System.out.println("3.Exit");
		System.out.println("4. DISPLAY QUEUE data");
		System.out.println("Enter your choice");
		int c=s.nextInt();
		int position;
		Double data;
		boolean x;
		switch(c)
		{
		case(1):
		{
			System.out.println("Enter your Data");
			data=s.nextDouble();
			obj4.enQueue(data);
			break;
		}
		case(2):
		{
			
		    x=obj4.isEmpty();
			data=obj4.deQueue();
			
			if(x==false){
			position=obj4.currentPosition();
			System.out.println("Data returned is "+data +" from position "+position);
			}
			break;
			
			
		}
		case(3):
		{
			
			temp=false;
			break;
		}
		case(4):
		{
			
			obj4.displayQueuen();
			break;
		}
		
		
		}
		
	} 
		
		}//
		case(6):
		{
			
			flag=false;
			break;
		}
		}
		
	}
	}
	
}