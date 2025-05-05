package Zadanie3;

public class FurnitureProvider {
    public static FurnitureFactory getFactory(String nameOfFactory)
                                        throws FactoryNotFoundException {
        switch (nameOfFactory) {
        case "HomeFactory": return new HomeFactory();
        case "OfficeFactory": return new OfficeFactory();
        default: throw new FactoryNotFoundException();
        }
    }
}

abstract class FurnitureFactory {
    public abstract Chair createChair();
    public abstract Table createTable();
}

class HomeFactory extends FurnitureFactory {
    public Chair createChair() { return new HomeChair(); }
    public Table createTable() { return new HomeTable(); }
}

class OfficeFactory extends FurnitureFactory {
    public Chair createChair() { return new OfficeChair(); }
    public Table createTable() { return new OfficeTable(); }
}

abstract class Chair {
    protected abstract String chairCanDo();
}

class HomeChair extends Chair {
    public String chairCanDo() { return "HomeChair is comfortable for living room"; }
}

class OfficeChair extends Chair {
    public String chairCanDo() { return "OfficeChair provides good back support"; }
}

abstract class Table {
    protected abstract String tableCanDo();
}

class HomeTable extends Table {
    public String tableCanDo() { return "HomeTable is perfect for family dinners"; }
}

class OfficeTable extends Table {
    public String tableCanDo() { return "OfficeTable has space for documents"; }
}

class FactoryNotFoundException extends RuntimeException {
    public String toString() {
        return "Фабрика nameOfFactory " + "HomeFactory, либо OfficeFactory";
    }
} 