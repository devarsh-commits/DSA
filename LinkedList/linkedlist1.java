class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    //Adding data at the head
    void addfirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void clearll(){
        Node temp=head;
        
    }
    void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void reverselist(){
      Node next=null;
      Node current=head;
      Node prev=null;
      while(current!=null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
      }
      head=prev;
        
    }
}
public class linkedlist1 {

    public static void main(String[] args) {
        LinkedList lst=new LinkedList();
        lst.insert(35);
        lst.insert(45);
        lst.insert(50);
        lst.insert(50);
        lst.insert(99);
        //lst.reverselist();
        lst.addfirst(100);
        lst.clearll();
        lst.Display();

    }
}