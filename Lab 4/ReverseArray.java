import java.util.Arrays; 
public class ReverseArray {
  public static void main(String[] args) {
    int[] array = {10, 20, 30, 40, 50};
    System.out.println("The original array is: " +  Arrays.toString(array));
    for (int i = 0; i < array.length / 2; i++) {
      int temp = array[i];
      array[i] = array[array.length - i - 1];
      array[array.length - i - 1] = temp;
    }
    System.out.println("The reversed array is: " +  Arrays.toString(array));
  }
}