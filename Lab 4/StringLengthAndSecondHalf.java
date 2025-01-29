import java.util.Scanner; 
public class StringLengthAndSecondHalf {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter a string: ");
    String str = input.nextLine(); 
    input.close(); 
    int len = str.length(); 
    int halfLen = len / 2;
    String secondHalf = str.substring(halfLen); 
    System.out.println("Length of the string: " + len); 
    System.out.println("Second half of the string: " + secondHalf); 
}
}