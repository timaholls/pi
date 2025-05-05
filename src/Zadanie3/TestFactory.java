package Zadanie3;

public class TestFactory {
    public static void main(String[] args) {
        BaseFactory baseFactory1 = AbstractFactory.getFactory("FactoryOne");
        A a1=baseFactory1.createA();
        System.out.println(a1.aCanDo());
        B b1=baseFactory1.createB();
        System.out.println(b1.bCanDo());
        
        BaseFactory baseFactory2 = AbstractFactory.getFactory("FactoryTwo");
        A a2=baseFactory2.createA();
        System.out.println(a2.aCanDo());
        B b2=baseFactory2.createB();
        System.out.println(b2.bCanDo());
    }
} 