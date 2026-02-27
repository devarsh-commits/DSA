class Stack{
    private
    int[] stackarr;
    int top;
    int size;
    public Stack(int size){
        this.size=size;
        top=-1;
        stackarr=new int[size];
    }
    public void push(int data){
        if(top>size-1){
            System.out.println("Stack over floww");
            return;
        }
        top++;
        stackarr[top]=data;
    }
    public void pull(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        top--;
    }
   public void isEmpty(){
        if(top==-1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public void peak(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(stackarr[top]);
    }
    public void Display(){
        if(top==1){
            System.out.println("Stack is empty");
        }
        for(int i=0;i<=top;i++){
          System.out.println(stackarr[i]+" ");
        }
    }

}  
public class StackArray {
    public static void main(String[] args) {
        Stack s=new Stack(5);
        s.push(12);
        s.push(22);
        s.push(32);
        s.push(42);
        s.push(52);
        s.pull();
        s.Display();
    }
}
