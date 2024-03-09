class Parent_One {
    void feature() {
        System.out.println("Parent_One executed successfully");
    }
}

class Parent_Two extends Parent_One {
    void feature2() {
        System.out.println("Parent_Two executed successfully");
    }
}

class Child extends Parent_Two{
    void feature3() {
        System.out.println("i'm the the child class of Parent_One and Parent_Two executed successfully");
    }
}

public class Multiple_inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.feature();
        c.feature2();
        c.feature3();
    }
}