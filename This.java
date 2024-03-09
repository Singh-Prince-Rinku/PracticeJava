class Example{
    int x,y;
    void Function(int x,int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
}


public class This {
    public static void main(String []args){
        Example E1 = new Example();
        E1.Function(5,6);
        E1.display();
    }
}
