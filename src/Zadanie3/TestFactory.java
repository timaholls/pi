package Zadanie3;

public class TestFactory {
    public static void main(String[] args) {
        FurnitureFactory factory1 = FurnitureProvider.getFactory("HomeFactory");
        Chair chair1 = factory1.createChair();
        System.out.println(chair1.chairCanDo());
        Table table1 = factory1.createTable();
        System.out.println(table1.tableCanDo());
        
        FurnitureFactory factory2 = FurnitureProvider.getFactory("OfficeFactory");
        Chair chair2 = factory2.createChair();
        System.out.println(chair2.chairCanDo());
        Table table2 = factory2.createTable();
        System.out.println(table2.tableCanDo());
    }
} 