import java.util.*;
class Node
{
	 int data;
	Node left;
	 Node right;
public Node()
{
	 data=0;
	 left=null;
	 right=null;
	}
	
	public Node(int d)
	{
	data=d;
    left=null;
    right=null;
	
	}
	
	
}
class binarytree

{
	Node root;
	
	
	   public Node insertLevelOrder(int[] arr, Node root, 
                                                int i) 
    { 
       
        if (i < arr.length) { 
            Node temp = new Node(arr[i]); 
            root = temp; 
  
           
            root.left = insertLevelOrder(arr, root.left, 
                                             2 * i + 1); 
  
            
            root.right = insertLevelOrder(arr, root.right, 
                                               2 * i + 2); 
        } 
        return root; 
    }
	
   public void PreOrder(Node root)
   {
	   if(root!=null)
	   {
		   System.out.println(root.data);
		   PreOrder(root.left);
		   PreOrder(root.right);
	   }
   } 
   public void InOrder(Node root)
   {
	   if(root!=null)
	   {
		   InOrder(root.left);
		   System.out.println(root.data);
		   
		   
		  InOrder(root.right);
	   }
   }   
	public void PostOrder(Node root)
   {
	   if(root!=null)
	   {
		   PostOrder(root.left);
		   PostOrder(root.right);
		   System.out.println(root.data);
		   
		   
		   
	   }
   } 
}
public class BinaryTree{
public static void main(String args[]) 
    { 
        binarytree t2 = new binarytree(); 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=s.nextInt();
		System.out.println("Enter Array");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
        arr[i]=s.nextInt();
		}
		t2.root = t2.insertLevelOrder(arr,t2.root , 0); 
        
		boolean flag=true;
		int choice;
		while(flag){
			System.out.println("Enter your choice");
			System.out.println("1.Preorder");
			System.out.println("2.Inorder");
			System.out.println("3.Postorder");
			System.out.println("Exit");
			choice=s.nextInt();
			switch(choice){
				case(1):
				{
				System.out.println("Preorder of tree is : ");	
				t2.PreOrder(t2.root);
				}
				case(2):
				{
				System.out.println("Inorder of tree is : ");	
				t2.InOrder(t2.root);
				}
				case(3):
				{
				System.out.println("Postorder of tree is : ");	
				t2.PostOrder(t2.root);
				}
				case(4):
				{
					flag=false;
				}
			}
			
		}
         
    }    
}