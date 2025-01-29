class Counts {
    private static int count = 0; 
    
    public Counts() {
        count++; 
    }
    
    public static int getObjectCount() {
        return count; 
    }
}

public class Count {
    public static void main(String[] args) {
        
        Counts obj1 = new Counts();
        Counts obj2 = new Counts();
        Counts obj3 = new Counts();
        
        System.out.println("Number of objects created: " + Counts.getObjectCount());
    }
}