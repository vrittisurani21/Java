public class Max {

    public static void main(String[] args) {
        int num1 = 10; // First number
        int num2 = 20; // Second number
        int num3 = 30; // Third number

        // Using ternary operator to find the maximum number
        int max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.println("The maximum number is: " + max);
    }
}