class Node {
    int data;
    Node next = null;

    public Node(int data) {
        this.data = data;
    }
}
class Stack{
    Node top;
    void push(int data){
        Node newNode=new Node(data);
        if(top==null){
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }
    void pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
        top=top.next;

    }
    void peak(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(top.data);
    }
    void Display(){
        if(top==null){
            System.out.println("stack is empty");
            return;
        }
        while(top!=null){
            System.out.println(top.data);
            top=top.next;
        }
    }
}

public class StackLinkedList {
public static void main(String[] args) {
    Stack s=new Stack();
    //s.peak();
    s.push(21);
    s.push(31);
    s.push(41);
    s.push(51);
    s.push(61);
   s.pop();
   s.Display();
}
}
