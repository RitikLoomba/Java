import java.util.Scanner;
class Node{
    public int data;
   public Node prev;
    public Node next;
    
    public Node(){
         prev=null;
         data=0;
        next=null;
    }
    public Node(Node n1,int d,Node n2){
         prev=n1;
         data=d;
        next=n2;
    }
    public void setPrev(Node n1){
     prev=n1;   
    }
    public  void setData(int d){
     data=d;   
    }
    public void setNext(Node n2){
     next=n2;   
    }
    public Node getPrev(){
     return prev;   
    }
    public int getData(){
     return data;   
    }
    public Node getNext(){
     return next;   
    }
}
class DoublyLinkedList{
   public int size;
   public Node start;
    
    public DoublyLinkedList(){
        size=0;
        start=null;
    }
    public boolean isEmpty(){
        if(start==null)
        {
            return(true);
        }
        else{
            return(false);
        }
    }
    public int getListsize(){
        return(size);
    }
    public void insertAtStart(int a){
        Node t=new Node();
       
        t.setData(a);
        t.setNext(start);
        t.setPrev(null);
         start=t;
         size++;
    }
    public void insertAtEnd(int a){
        Node t=new Node();
        Node x;
        
       if(isEmpty()){
           insertAtStart(a);
       }
       else{
           x=start;
           for(int i=1;i<=size-1;i++)
            {
                x=x.getNext();
            }
        t.setData(a);
        t.setNext(null);
        t.setPrev(x);
        x.setNext(t);
         size++;
    }
    }
    public void insertAtPos(int a,int p){
        Node t=new Node();
        Node x,x1;
        if(isEmpty())
        {
            insertAtStart(a);
        }
        else if(p>size){
            insertAtEnd(a);
        }
        else{
            x=start;
            for(int i=1;i<p;i++) 
            {
                x=x.getNext();
                
            }
            x1=x.getPrev();
        t.setData(a);
        t.setPrev(x.getPrev());
        t.setNext(x);
        x1.setNext(t);
        x.setPrev(t);
        
        x.setNext(null);
        
         
         size++;
    }
	}
	public void deleteFirst(){
	    Node x;
	    if(isEmpty()){
	        System.out.println("List is Empty");
	    }
	    else{
	      start=start.getNext();
	      start.setPrev(null);
	      size--;
	    }
	}
	public void deleteLast(){
	    Node x;
	    if(size==1){
	        deleteFirst();
	    }
	    else{
	        x=start;
	        for(int i=1;i<size-1;i++)
	        {
	            x=x.getNext();
	        }
	        x.setNext(null);
	        size--;
	    }
	}
	public void deleteFromPos(int p){
	    Node x,x1,x2;
	    if(p==1){
	        deleteFirst();
	    }
	    else if(p==size){
	    deleteLast();}
	    else{
	        x=start;
	        for(int i=1;i<size-1;i++)
	        {
	            x=x.getNext();
	            
	        }
	        x1=x.getNext();
	        x2=x.getPrev();
	        x1.setPrev(x2);
	        x2.setNext(x1);
	        size--;
	        
	    }
	}
	
	public void reverse(){
	    Node x,x1,x2,x3,temp;
	    if(size==1){
	        System.out.println("List remain same");
	    }
	    else{
	        
	        x=start;
			x1=start;
			x2=start;
	        for(int i=1;i<size;i++){
				x=x.getNext();
	         x1=x2.getPrev();
			
	         x2=x2.getNext();
	          x3=x2.getPrev();
			 x3.setPrev(x2);
			 x3.setNext(x1);
	        }
			temp=x.getPrev();
			x.setPrev(null);
			x.setNext(temp);
			start=x;

	    }
	}
 public void viewList(){
         Node x;
        if(start==null)
        {
            System.out.println("List Is Empty");
        }
        else
        {
           x=start;  
            for(int i=1;i<=size;i++)
            {
              System.out.println(" "+x.getData());
              x=x.getNext();
            }
        }
    }
    public  void  search(int a){
        Node x=start;
        int y=0,x1;
		int flag=0;
        for(int i=1;i<=size;i++){
            x1=x.getData();
            y++;
            if(a==x1)
           {
            System.out.println("Position of data is"+" "+y);
            flag=1;
           }
        
            x=x.getNext();
		}
            if(flag!=1)
		    {
				
			   System.out.println("Data not matched anywhere");
			}
       
    
	}
    
}
public class Double{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in) ;
       DoublyLinkedList list=new DoublyLinkedList();
       boolean flag=true;
       while(flag){
           System.out.println("1.Add at first");
           System.out.println("2.Add at last");
           System.out.println("3.Add at position");
           System.out.println("4.Delete from first");
           System.out.println("5.Delete from last");
           System.out.println("6.Delete from position");
           System.out.println("7.View list");
           System.out.println("8.Exit");
		   System.out.println("9.Reverse list");
		   System.out.println("10.Search");
       System.out.println("Enter your choice");
       int choice=s.nextInt();
       int data,position;
       switch(choice){
           case 1:
              {
                  System.out.println("Enter data");
                  data=s.nextInt();
                  list.insertAtStart(data);
                  break;
              }
              case 2:
              {
                  System.out.println("Enter data");
                  data=s.nextInt();
                  list.insertAtEnd(data);
                  break;
              }
              case 3:
              {
                  System.out.println("Enter data");
                  data=s.nextInt();
                   System.out.println("Enter position");
                  position=s.nextInt();
                  list.insertAtPos(data,position);
                  break;
              }
              case 4:
                  {
                      list.deleteFirst();
                      break;
                  }
              case 5:
                  {
                      list.deleteLast();
                      break;
                  }
                  case 6:
                  {   
                      System.out.println("Enter position");
                  position=s.nextInt();
                      list.deleteFromPos(position);
                      break;
                  }
              case 7:
              {
                 
                  list.viewList();
                  break;
              }
             
              case 8:
                  {
                      flag=false;
                      break;
                  }
			 case 9:
			 {
				 list.reverse();
				 break;
			 }
			  case 10:
                  {   
                      System.out.println("Enter data to be searched");
                  data=s.nextInt();
                      list.search(data);
                      break;
                  }
              default: 
              {
                  System.out.println("Invalid");
              }
              
       }
       
    }
    }
}