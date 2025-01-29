public class ComplexNumber {
    private double real; 
    private double imaginary;

   
    public ComplexNumber() {
        this(0.0, 0.0);
    }

   
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3.0, 4.0);
        ComplexNumber c2 = new ComplexNumber(1.0, 2.0);

        
        ComplexNumber sum = c1.add(c2);

        System.out.println("c1: " + c1.getReal() + " + " + c1.getImaginary() + "i");
        System.out.println("c2: " + c2.getReal() + " + " + c2.getImaginary() + "i");
        System.out.println("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");
    }
}