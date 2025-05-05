package Zadanie2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class University {
    private String name;
    private List faculties = Collections.synchronizedList(new ArrayList());
    private static University university = new University();
    
    private University() {} // закрытый конструктор
    
    public static University getUniversity() { return university; }
    
    public String getName() { return name; }
    
    public void setName(String name) { this.name = name; }
    
    public void addFaculty(String faculty) {
        faculties.add(faculty);
    }
    
    public void removeFaculty(String faculty) {
        faculties.remove(faculty);
    }
    
    public void clear() {
        faculties.clear();
    }
    
    public String getFaculty(int i) {
        return faculties.get(i).toString();
    }
    
    public String toString() {
        StringBuffer myUniversity = new StringBuffer();
        myUniversity.append("Университет: " + name);
        
        for (int i=0; i<faculties.size(); i++) {
            myUniversity.append("\n" + (i+1) + " факультет: " + getFaculty(i));
        }
        
        return myUniversity.toString();
    }
} 