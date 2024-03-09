class demo {
    int x, y;

    demo(int args1, int args2) {
        x = args1;
        y = args2;
    }

    demo() {

    }
}

public class Constructor {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        demo d1 = new demo(4, 5);
        @SuppressWarnings("unused")
        demo d2 = new demo(55, 44);
    }
}

/// there are two type of constructor
/// 1. Default
/// 2. Parameterized constructor