class Dnode{
    int data;
    Dnode prev;
    Dnode next;
    public Dnode(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class Doublylinkedlist{
    Dnode head;
    void insert(int data){
        Dnode neweDnode=new Dnode(data);
        if(head==null){
            head=neweDnode;
            return;
        }
        Dnode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        neweDnode.prev=temp;
        temp.next=neweDnode;
    }
    void Display(){
        Dnode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }

}
 public class doublyreverse {
    public static void main(String[] args) {
        DoublyLinkedlist ll=new DoublyLinkedlist();
        ll.insert(45);
        ll.insert(55);
        ll.insert(65);
        ll.insert(75);
        ll.insert(85);
        ll.insert(95);
        ll.insert(105);
        ll.Display();
    }
}
