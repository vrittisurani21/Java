interface Transport {
    void deliver();
}

abstract class Animal {
   
}

class Tiger extends Animal{

}

class Camel extends Animal implements Transport {
    @Override
    public void deliver() {
        System.out.println("Hello from Camel");
    }
}

class Deer extends Animal{

}

class Donkey extends Animal implements Transport {
    @Override
    public void deliver() {
        System.out.println("Hello from Donkey");
    }
}

public class Lab7_3 {
    public static void main(String[] args) {
       
        Animal[] animals = new Animal[4];
        animals[0] = new Tiger();
        animals[1] = new Camel();
        animals[2] = new Deer();
        animals[3] = new Donkey();
        
        for (Animal a1 : animals) {
            if (a1 instanceof Transport) {
                ((Transport) a1).deliver();
            }
        }
    }
}