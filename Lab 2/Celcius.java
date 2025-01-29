import java.util.Scanner;
public class Celcius {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("f");
        int f=sc.nextInt();
        System.out.println("Celcius="+((f-32)*5/9));
    }
}
