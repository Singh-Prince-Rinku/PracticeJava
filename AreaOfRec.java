import java.util.*;

class Area_Of_Rectangle {
    int area;
    int rec;
    int bre;
    Scanner sc = new Scanner(System.in);

    void Length() {
        System.out.println("Enter Length of Rectangle:");
        rec = sc.nextInt();
    }

    void Bredth() {
        System.out.println("Enter Bredth of Rectangle:");
        bre = sc.nextInt();
    }

    void Area() {
        area = rec * bre;
    }

    void display() {
        System.out.println("Area of Rectangle:" + area);
    }
}

public class AreaOfRec {
    public static void main(String[] args) {
        System.out.println("Finding Area of  Rectangle:");
        Area_Of_Rectangle A1 = new Area_Of_Rectangle();
        A1.Length();
        A1.Bredth();
        A1.Area();
        A1.display();
    }
}
