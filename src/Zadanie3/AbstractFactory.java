package Zadanie3;

public class AbstractFactory {
    public static BaseFactory getFactory(String nameOfFactory)
                                        throws FactoryNotFoundException {
        switch (nameOfFactory) {
        case "FactoryOne": return new FactoryOne();
        case "FactoryTwo": return new FactoryTwo();
        default: throw new FactoryNotFoundException();
        }
    }
}

abstract class BaseFactory {
    public abstract A createA();
    public abstract B createB();
}

class FactoryOne extends BaseFactory {
    public A createA() { return new A_One(); }
    public B createB() { return new B_One(); }
}

class FactoryTwo extends BaseFactory {
    public A createA() { return new A_Two(); }
    public B createB() { return new B_Two(); }
}

abstract class A {
    protected abstract String aCanDo();
}

class A_One extends A {
    public String aCanDo() { return "class A_One can do objectA_One"; }
}

class A_Two extends A {
    public String aCanDo() { return "class A_Two can do objectA_Two"; }
}

abstract class B {
    protected abstract String bCanDo();
}

class B_One extends B {
    public String bCanDo() { return "class B_One can do objectB_One"; }
}

class B_Two extends B {
    public String bCanDo() { return "class B_Two can do objectB_Two"; }
}

class FactoryNotFoundException extends RuntimeException {
    public String toString() {
        return "Фабрика nameOfFactory " + "FactoryOne, либо FactoryTwo";
    }
} 