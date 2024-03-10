class PerimeterOfRectangle {
    int perimeter;
    int length;
    int width;

    void per(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

class POR extends PerimeterOfRectangle {
    void perimeter(int length, int width) {
        super.length = length;
        super.width = width;
        perimeter = 2 * (length + width);
    }
}
class Per_Of_Rec extends POR{
void peri(){
System.out.println(perimeter);
}
}

public class PerimeterOfRec {
    public static void main(String[] args) {
        Per_Of_Rec rec = new Per_Of_Rec();
        rec.perimeter(4,4);
        rec.peri();
    }
}
