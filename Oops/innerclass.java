public class innerclass { //outer class
    void type(){
        System.out.println("Hello  I from outer class");
    }
     class Innerinnerclass {
        void type(){
            System.out.println("I am from inner class");
        }    
    }
    public static void main(String[] args) {
        //here we'll learn about creating obj of outer class
        innerclass out=new innerclass(); //creating obj of outer class
        innerclass.Innerinnerclass inn=out.new Innerinnerclass(); //creating obj of inner class
        out.type();
        inn.type();

    }
}
