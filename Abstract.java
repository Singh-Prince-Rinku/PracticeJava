abstract class Abs {
    String Password;
    String UserName;

    Abs() {
        Password = "XXIIC";
        UserName = "MR.X";
    }

}

class Abs2 extends Abs {
    Abs2() {
        super();
    }

    void Display() {
        System.out.println(Password + " " + UserName);
    }
}

public class Abstract {
    public static void main(String[] args) {
        Abs2 ab = new Abs2();
        ab.Display();
    }
}
