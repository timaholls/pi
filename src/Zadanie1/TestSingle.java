package Zadanie1;
public class TestSingle {
    public static void main(String[] args) {
        Single single1=Single.getSingle(); //Создан на объект?=single
        System.out.println(single1.toString());
        SingleSynch single2=SingleSynch.getSingleSynch(); //Создан новый объект?
        System.out.println(single2.toString());
        for(int i=1; i<5; i++){
            if (Single.getSingle()==single1) System.out.println("Объект уже есть");
            else System.out.println("Создан новый объект");
            if (SingleSynch.getSingleSynch()==single2) System.out.println("Объект уже есть");
            else System.out.println("Создан новый объект");
        }
        System.out.println(Single.getSingle().toString());
        System.out.println(SingleSynch.getSingleSynch().toString());
    }}
class Single{ // объект создается при компиляции
    private static Single single = new Single();
    private Single(){}
    public static Single getSingle(){return single;}
}
class SingleSynch { // объект создается с синхронизацией потока
    private volatile static SingleSynch singleSynch; //не кэшировать
    private SingleSynch() {}
    public static SingleSynch getSingleSynch() {
        if (singleSynch == null) {
            synchronized (SingleSynch.class) { //синхронизация потока
                if (singleSynch == null) {singleSynch = new SingleSynch();}
            }}
        return singleSynch;
    }
} 