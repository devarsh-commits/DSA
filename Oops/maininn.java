class outerclass {
int x=10;
class innerclass{
    int valfun(){
        return x;
    }
}
    
}

public class maininn {
    public static void main(String[] args) {
        outerclass out=new outerclass();
        outerclass.innerclass in=out.new innerclass();
        System.out.println(in.valfun());
    }
}
