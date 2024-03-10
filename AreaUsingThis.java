class Area {
    int Length;
    int Bredth;

    void calculatedArea(int Length, int Bredth) {
        this.Length = Length;
        this.Bredth = Bredth;
    }
}

class calculated extends Area{
    int area;
    void cal(int Length, int Bredth){
        super.Length = Length;
        super.Bredth = Bredth;
        area = Length * Bredth;

    }
}

class ACalculating extends calculated {
    void display() {
        System.out.println(area);
    }
}

public class AreaUsingThis {
    public static void main(String[] args) {
        ACalculating AC = new ACalculating();
        AC.cal(10, 20);
        AC.display();
    }
}
