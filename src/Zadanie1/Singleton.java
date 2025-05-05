package Zadanie1;

public class Singleton {
    // Приватное статическое поле, содержащее единственный экземпляр класса
    private static Singleton instance = null;
    
    // Защищенный конструктор
    private Singleton() {
        System.out.println("Создан объект Singleton");
    }
    
    // Статический метод, возвращающий единственный экземпляр класса
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Первый вызов getInstance(), создан экземпляр");
        } else {
            System.out.println("Повторный вызов getInstance()");
        }
        return instance;
    }
    
    // Метод для проверки работы синглтона
    public void printInfo() {
        System.out.println("Это объект Singleton");
    }
} 