class PerimeterOfRectangle {
    private int x, y;
    private int z;

    public void Area(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 2 * (x + y);
    }

    void display() {
        System.out.println("Perimeter of Rectangle: " + z);
        System.out.println("Area of Rectangle: " + x * y);
    }
}

public class Experiment {
    public static void main(String[] args) {
        PerimeterOfRectangle p = new PerimeterOfRectangle();
        p.Area(3, 4);
        p.display();
    }
}
