abstract class Examples{
    void function(){
        System.out.println("Abstract Here: ");
    }
}
class Examples2 extends Examples{
    void function2(){
        System.out.println("and Abstract is executed by child class: ");
    }
}

public class Abstract_one {
    public static void main(String[] args) {
        Examples2 E = new Examples2();
        E.function();
        E.function2();
    }
}
