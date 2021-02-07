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
    public void setNext(Node n){
        next=n;
    }
      public void setData(int d){
        data=d;
    }
    public Node getNext()
    {
        return next;
    }
    public int getData()
    {
        return data;
    }
}
class LinkedList{
   public int size;
   public  Node start;
     
    public LinkedList(){
        size=0;
        start=null;
    }
    public boolean isEmpty()
    {
       if(start==null){
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
        Node t;
        t=new Node();
        t.setData(a);
        t.setNext(start);
        start=t;
        size++;
        
    }
    public void insertAtEnd(int a)
    {
        Node t,x;
        t=new Node();
        if(isEmpty())
        {
            insertAtStart(a);
        }
        else{
           t.setData(a);
           x=start;
           for(int i=1;i<=size-1;i++)
            {
                x=x.getNext();
                
            }
            x.setNext(t);
            
        size++; 
        }
    }
    public void insertAtPos(int a,int pos)
    {
        Node t,x;
        t=new Node();
        if(pos==1)
        {
              insertAtStart(a);
        }
        else if(pos>size){
           insertAtEnd(a);
        }
        else{
            t.setData(a);  
            x=start;
            for(int i=1;i<pos-1;i++)
            {
                x=x.getNext();
                
                
            }
        
            t.setNext(x.getNext());
            x.setNext(t);
            size++;
        }
    }
    public void deleteFirst()
    {
        if(isEmpty()){
            System.out.println("No Item To Delete");
        }
        else{
            start=start.getNext();
            size--;
        }
    }
     public void deleteLast()
    {
        if(size==1){
         deleteFirst();   
        }
        else{
            Node x;
            x=start;
            for(int i=1;i<size-1;i++)
            {
                x=x.getNext();
                
            }
            x=null;
            size--;
        }
    }
    public void deleteAtPos(int pos){
        Node x=start,x1=start;
         if(pos==1){
         deleteFirst();   
        }
        else if(pos==size){
            deleteLast();
        }
        else{
           
           
            for(int i=1;i<pos-1;i++)
            {
                x=x.getNext();
                
            }
            for(int i=1;i<pos;i++)
            {
                x1=x1.getNext();
               
            }
            
            x.setNext(x1.getNext());
            size--;
         
        }
    }
	 public void reverse(){
        Node nex=null;
        Node prev=null;
		Node curr=start;
        
        if(size==1){
            System.out.println("List Remain Same");
        }
        else{
			while(curr!=null){
				nex=curr.getNext();
				curr.setNext(prev);
				prev=curr;
				curr=nex;
			}
			start=prev;
			
               
				
              
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
    
    
}
public class MyClass{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in) ;
       LinkedList list=new LinkedList();
       boolean flag=true;
       while(flag){
           System.out.println("1.Add at first");
           System.out.println("2.Add at last");
           System.out.println("3.Add at position");
           System.out.println("4.Delete first");
           System.out.println("5.Delete last");
           System.out.println("6.Delete from position");
           System.out.println("7.View list");
           System.out.println("8.Exit");
		   System.out.println("9.Reverse the list");
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
                  list.deleteAtPos(position);
              }
              case 7:{
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
              default: 
              {
                  System.out.println("Invalid");
              }
              
       }
       
    }
    }
}