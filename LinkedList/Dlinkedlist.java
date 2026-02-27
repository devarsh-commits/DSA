class Dnode{
    int data;
    Dnode next;
    Dnode prev;
    public Dnode(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class DoublyLinkedlist{
    Dnode head;
    void insert(int data){
        Dnode newnode=new Dnode(data);
        if(head==null){
            head=newnode;
            return;
        }
        Dnode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        newnode.prev=temp;
        temp.next=newnode;
    }
    void Display(){
        Dnode temp=head;
        while(temp!=null){
            System.out.print(" <-- "+temp.data+" -->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void Rdisplay(){
        Dnode current=head;
        Dnode temp = null;
        while(current!=null){
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }
        if(temp!=null){
            head=temp.prev;
        }
    }
}
public class Dlinkedlist {
    public static void main(String[] args) {
        DoublyLinkedlist ll=new DoublyLinkedlist();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);
        //ll.Rdisplay();
        ll.Display();
        ll.Rdisplay();
        ll.Display();
    }
}
