import java.util.Scanner;

class Bank {
    int account;
    double balance;
    String name;
    String email;

    Bank(){
      
    }

    void getAccountDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account : ");
        this.account = sc.nextInt();
        System.out.println("Enter name : ");
        this.name = sc.next();
        System.out.println("Enter email ");
        this.email=sc.next();
        System.out.println("Enter balance");
        this.balance=sc.nextDouble();


    }

    void diaplayDetail() {
        System.out.println("account no.:" + account);
        System.out.println("account name :"+name);
        System.out.println("email name :"+email);
        System.out.println("balance no. :"+balance);
    }
}

public class Bankac{
            public static void main(String[] args) {
                
                Bank b1 = new Bank();
                b1.getAccountDetail();
                b1.diaplayDetail();
            }
}