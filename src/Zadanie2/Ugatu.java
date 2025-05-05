package Zadanie2;

class Ugatu{
    private Ugatu() {}
    
    public static University getUgatu() {
        University ugatu = University.getUniversity();
        ugatu.clear();
        ugatu.setName("УГАТУ");
        ugatu.addFaculty("Торно-нефтяной факультет (ТНФ)");
        ugatu.addFaculty("Факультет авиационных двигателей (ФД)");
        ugatu.addFaculty("Факультет автоматизации производственных процессов (ФАПП)");
        ugatu.addFaculty("Факультет трубопроводного транспорта (ФТТ)");
        ugatu.addFaculty("Механический факультет (МФ)");
        ugatu.addFaculty("Факультет общеиучных дисциплин (ФОНД)");
        return ugatu;
    }
} 