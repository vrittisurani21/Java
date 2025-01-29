import java.util.Scanner;
public class Marks{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Subject 1");
        int a=sc.nextInt();
        System.out.println("Subject 2");
        int b=sc.nextInt();
        System.out.println("Subject 3");
        int c=sc.nextInt();
        System.out.println("Subject 4");
        int d=sc.nextInt();
        System.out.println("Subject 5");
        int e=sc.nextInt();
        double avg = (a+b+c+d+e)/5.0;
        if(avg>=60){
            System.out.println("First Division");
        }
        else if(avg>=50){
            System.out.println("Second Division");
        }
        else if(avg>=40){
            System.out.println("Third Division");
        }
        else if(avg<40){
            System.out.println("Fail");
    }
}
}
    

