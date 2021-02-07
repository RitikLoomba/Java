import java.util.Scanner;
class Node{
  public int data;
  public Node next;
  
  public Node(){
      data=0;
      next=null;
      
  }
    public Node(int d,Node n){
        data=d;
        next=n;
    }
    public void setData(int d){
        data=d;
        
    }
    public void setNext(Node n){
        next=n;
        
    }
        public int getData(){
        return data;
        
    }
    public Node getNext(){
       return next;
        
    }
}
class circularLinkedList{
    public int size;
    public Node last;
    
    public boolean isEmpty(){
        if(last==null){
            return(true);
        }
        else{
        return(false);
        }
    }
    public void insertAtFirst(int a){
     Node t=new Node();
     Node x;
     t.setData(a);
     if(isEmpty())
     {    
         last=t;
         t.setNext(last);
         
     }
     else{
         
         x=last.getNext();
         t.setNext(x);
         last.setNext(t);
     
     }
	 size++;
    }
    public void insertAtLast(int a){
        
        if(isEmpty())
        { 
            insertAtFirst(a);
        }
        else{
            Node t=new Node();
            t.setData(a);
            Node x=last.getNext();
            last.setNext(t);
            t.setNext(x);
			last=t;
            size++;
			
        }
    } 
	public void insertAtPosition(int a,int p)
	{
	   if(p==1){
		   insertAtFirst(a);
	   }
	   else if(p>size){
		   insertAtLast(a);
	   }
	   else{
		   Node t=new Node();
		   t.setData(a);
		   Node x=last.getNext();
		   
		   for(int i=1;i<p-1;i++){
			x=x.getNext();
			
		   }
		    t.setNext(x.getNext());
		   x.setNext(t);
		  size++;
		   
		  
	   }
	}
	public void deleteFirst(){
		if(isEmpty())
		{
			System.out.println("List is Empty");
		}
		else if(size==1){
			  last=null;
			  size--;
		}
		else{
			Node x=last.getNext();
			Node x1=x.getNext();
			x.setNext(null);
			last.setNext(x1);
			size--;
		}
	}
	public void deleteLast(){
		if(size==1)
		{
			deleteFirst();
		}
		else{
			Node x;
			x=last.getNext();
			for(int i=1;i<size-1;i++){
				x=x.getNext();
			}
			x.setNext(last.getNext());
			last=x;
            size--;  			
		}
	}
	public void deleteFromPosition(int p)
	{
		if(p==1){
			deleteFirst();
		}
		else if(p==size){
			deleteLast();
			
		}
		else if(p>size){
			System.out.println("invalid");
		}
		else{
			Node x=last.getNext();
			Node y;
			Node z;
			
			for(int i=1;i<p-1;i++)
			{
				x=x.getNext();
			}
			y=x.getNext();
			z=y.getNext();
			x.setNext(z); 
			y.setNext(null);
			size--;
		}
	}
    public void viewList(){
        if(isEmpty()){
            System.out.println("List is empty");
        }
        else{
        Node x=last.getNext();
        for(int i=1;i<=size;i++){
            System.out.println(" "+x.getData());
            x=x.getNext();
        }
        }
    }
}
public class Circular{
     public static void main(String[] args){
       Scanner s=new Scanner(System.in) ;
       circularLinkedList list=new circularLinkedList();
       boolean flag=true;
       while(flag){
           System.out.println("1.Add at first");
           System.out.println("2.Add at last");
		   System.out.println("3.Add at positon");
		   System.out.println("4.Delete first");
		   System.out.println("5.Delete last");
		   System.out.println("6.Delete from positon");
           System.out.println("7.View list");
           
           System.out.println("8.Exit");
            System.out.println("Enter your choice");
            int choice=s.nextInt();
            int data,position;
            
       switch(choice)
       {
          case(1):
              {
                  System.out.println("Enter the data ");
                   data=s.nextInt();
                   list.insertAtFirst(data);
                   break;
                   
              }
              case(2):
                  {
                      System.out.println("Enter the data");
                      data=s.nextInt();
                      list.insertAtLast(data);
                      break;
                  }
				   case(3):
                  {
                      System.out.println("Enter the data");
                      data=s.nextInt();
					  System.out.println("Enter the position");
                      position=s.nextInt();
                      list.insertAtPosition(data,position);
                      break;
                  }
				  case(4): 
                  {
                      list.deleteFirst();
                      break;
                  }
				  case(5): 
                  {
                      list.deleteLast();
                      break;
                  }
				  case(6):
				  
				  { 
				   System.out.println("Enter the position ");
                   position=s.nextInt();
				   list.deleteFromPosition(position);
				   break;
				  }
              case(7): 
                  {
                      list.viewList();
                      break;
                  }
              
        case(8):
            {
                flag=false;
                break;
            }
       }
           
       }
     }
       
       
}