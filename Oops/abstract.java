

abstract class A{
    int a=10;
    void run(){
        System.out.println("I am from abstract clasass");
    }
    abstract void fun2();
}

class B extends A{
    @Override
    void run() {
        // TODO Auto-generated method stub
        super.run();
    }
    @Override
    void fun2() {
        // TODO Auto-generated method stub
        System.out.println("I am from inherit abstract");
    }
}

public class Abstract {
    public static void main(String[] args) {
        
    }
}
