package Zadanie1;

public class TenSingle {
    public static void main(String[] args) {
        // Получаем экземпляр класса Singleton
        System.out.println("Первое обращение к объекту Singleton:");
        Singleton single1 = Singleton.getInstance();
        single1.printInfo();
        
        // Пытаемся получить второй экземпляр класса Singleton
        System.out.println("\nВторое обращение к объекту Singleton:");
        Singleton single2 = Singleton.getInstance();
        single2.printInfo();
        
        // Проверяем, что single1 и single2 указывают на один и тот же объект
        System.out.println("\nПроверка идентичности объектов:");
        if(single1 == single2) {
            System.out.println("single1 и single2 - это один и тот же объект");
        } else {
            System.out.println("single1 и single2 - разные объекты");
        }
    }
} 