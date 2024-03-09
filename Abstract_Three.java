abstract class Abstract {

    Abstract() {
        System.out.println("Parent Constructor");
    }
}

class Abstract2 extends Abstract {
    Abstract2() {
        System.out.println("Child Constructor");
    }
}

public class Abstract_Three {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Abstract2 A2 = new Abstract2();
    }
}
