class Student {
    int id; 
    String name; 
    static String college = "ABC"; 
    
    
    Student(int id, String name) {
        this.id = id; 
        this.name = name; 
    }
    
    
    void display() {
        System.out.println("Student id: " + this.id); 
        System.out.println("Student name: " + this.name); 
        
        System.out.println("College name: " + Student.college);
    }
}


public class Keyword {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice"); 
        Student s2 = new Student(102, "Bob"); 
        s1.display(); 
        s2.display(); 
    }
}