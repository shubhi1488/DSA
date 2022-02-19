class Node{
    int data;
    Node next;
    Node(int data){
     this.data=data;
     this.next=null;
    }
}
 class LinkedList {
 Node head;
 //inserting the node at the starting
 public void insert(int data){
     Node n1=new Node(data);
     n1.next=head;
     head=n1;
 }
 //inserting the node inbetween other nodes
     public void insert_inbetween(Node previous,int data){
     if(previous==null){
         System.out.println("linked list cannot be empty");
         return;
     }
     Node n1=new Node(data);
     n1.next=previous.next;
     previous.next=n1;
     }
     //inserting the node at last of the linked list
     public void append(int data){
     Node n1=new Node(data);
     if(head==null){
         head=n1;
         return;
     }
     n1.next=null;
     Node temp=head;
     while(temp.next!=null){
         temp=temp.next;
     }
     temp.next=n1;
     return;
     }
     //printing the elements of linked list
     public void display(){
     Node temp=head;
     while(temp!=null){
         System.out.println(temp.data+" ");
         temp=temp.next;
     }
     }

     public static void main(String[] args) {
         LinkedList obj=new LinkedList();
         obj.insert(2);
         obj.insert(3);
         obj.append(4);
         obj.insert_inbetween(obj.head.next,5);
         obj.display();
     }
}
