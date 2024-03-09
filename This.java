class Example {
    int x, y;

    void Function(int x, int y) {
        this.x = x; // This is used for current refer
        this.y = y;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
    }
}

class Example2 extends Example {
    int x, y;

    void Function2(int x, int y) {
        super.x = x; // super is used here for send x value to the parent class
        super.y = y; // super is used here for send y value to the parent class
    }

    void display2() {
        System.out.println(x);
        System.out.println(y);
    }
}

public class This {
    public static void main(String[] args) {
        Example2 E2 = new Example2();
        E2.Function2(5, 6);
        E2.display();
    }
}
