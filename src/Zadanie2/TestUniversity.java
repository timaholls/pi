package Zadanie2;

public class TestUniversity {
    public static void main(String[] args) {
        University ugatu=University.getUniversity();
        System.out.println(ugatu.toString());
        
        ugatu = Ugatu.getUgatu();
        System.out.println(ugatu.toString());
        
        ugatu.setName("УГНТУ");
        ugatu.removeFaculty("Торно-нефтяной факультет (ТНФ)");
        System.out.println(ugatu.toString());
        
        University ugatu1 = Ugatu.getUgatu();
        if (ugatu==ugatu1) System.out.println("ugatu==ugatu1? ОК!!!");
        System.out.println(ugatu1.toString());
        
        University ugatu2 = University.getUniversity();//killm
        if (ugatu==ugatu2) System.out.println("ugatu==ugatu2? ОК!!!");
        System.out.println(ugatu2.toString());
    }
} 