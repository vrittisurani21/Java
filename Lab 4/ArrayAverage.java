public class ArrayAverage {
  public static void main(String[] args) {
    int[] array = {10, 20, 30, 40};
    int sum = 0;
    double average = 0.0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    average = (double) sum / array.length;
    System.out.println("The array is: " + java.util.Arrays.toString(array));
    System.out.println("The sum is: " + sum);
    System.out.println("The average is: " + average);
  }
}