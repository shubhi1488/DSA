//implementation of singly linked list
public class Node//......................creating the Node class ..................
{
    int data;
    Node next;//.....................self referential structure...................

    public Node(int data) {
        this.data = data;
        this.next = null;//...........in starting the node will not point to another so its next will be null.......
    }
}
class SinglyLinkedList{
   //.........when the list is empty than their will be no head and tail so intializing them with null values.....
    public Node head=null;//................starting node is called as head of list............
    public  Node tail=null;//.....end node is called as tail of the list....................
    //method to create the new node in the list......................
    public void addNode(int data){
        Node newnode=new Node(data);//...........new node have been created with data value.......
        if(head==null){
            //if the head and tail is null then the new node will become the head and tail of the list
            head=newnode;
            tail=newnode;
        }
        else {
            //if their is already elements present in list so we provide the reference address of newnode in previous
            //tail and we make newnode as tail .
            tail.next=newnode;
            tail=newnode;
        }
    }
    public void display(){
        Node current=head;//..........we have created a node class instance variable which is a pointer which point
        //the head of the list ...........
        if(head==null){
            System.out.println("empty list");//if the list is empty or head is equal to null than we print empty list
            return;//and take the conrol out through return statement.........
        }
        System.out.println("elements of linked list are:");
        while (current!=null){
            System.out.println(current.data);//we print the data from starting
            current=current.next;//we increase the value of pointer variable with 1
        }
        System.out.println();

    }
    //main method
    public static void main(String[] args) {
        SinglyLinkedList obj=new SinglyLinkedList();//object creation
        obj.addNode(2);
        obj.addNode(3);
        obj.addNode(4);
        obj.display();
        //ouput:2 3 4
    }
}
