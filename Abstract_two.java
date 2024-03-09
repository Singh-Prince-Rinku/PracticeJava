abstract class Demo {
    int x = 10, y = 20;
    abstract void fun1(); 
}
class Demo2 extends Demo{
    void fun1() {   // we use method overwrite
        System.out.println(x);
        System.out.println(y);
    }
}

public class Abstract_two {
    public static void main(String[] args) {
        Demo2 D = new Demo2();
        D.fun1();
    }
}
