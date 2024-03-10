abstract class Abstract{
    int a,x, y;
    void addition(int p, int q){
        int x = p;
        int y = q;
    }
}
class Abs extends Abstract{
    void display(){
        int a = x+y;
        System.out.println("your Addition is"+a);
    }
}

public class Abstract5 {
    public static void main(String[] args){
        Abs A1 = new Abs();
        A1.addition(5,6);
        A1.display();
    }
}
