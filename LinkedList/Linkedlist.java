

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class mylinkedlist{
    Node head;
    void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }
}
 class Linkedlist{
    public static void main(String[] args) {
        mylinkedlist list=new mylinkedlist();
        list.insert(35);
        list.insert(40);
        list.insert(50);
        list.insert(100);
        list.insert(100);

        list.Display();

    }
}