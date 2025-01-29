import java.util.Scanner;
import java.util.Arrays;

public class Student {
    private int idNo;
    private int noOfSubjectsRegistered;
    private String[] subjectCode;
    private int[] subjectCredits;
    private char[] gradeObtained;
    private double spi;

    
    public Student(int idNo, int noOfSubjectsRegistered, String[] subjectCode,
                   int[] subjectCredits, char[] gradeObtained) {
        this.idNo = idNo;
        this.noOfSubjectsRegistered = noOfSubjectsRegistered;
        this.subjectCode = subjectCode;
        this.subjectCredits = subjectCredits;
        this.gradeObtained = gradeObtained;
        calculateSPI();
    }

    
    private void calculateSPI() {
        double totalCredits = 0;
        double weightedGradeSum = 0;

        for (int i = 0; i < noOfSubjectsRegistered; i++) {
            totalCredits += subjectCredits[i];
            weightedGradeSum += getGradePoints(gradeObtained[i]) * subjectCredits[i];
        }

        spi = weightedGradeSum / totalCredits;
    }

    
    private double getGradePoints(char grade) {
        switch (grade) {
            case 'A':
                return 10.0;
            case 'B':
                return 8.0;
            case 'C':
                return 6.0;
            case 'D':
                return 4.0;
            default:
                return 0.0; 
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("ID Number: ");
            int idNo = sc.nextInt();
            System.out.print("Number of subjects registered: ");
            int numSubjects = sc.nextInt();

            String[] subjectCodes = new String[numSubjects];
            int[] subjectCredits = new int[numSubjects];
            char[] grades = new char[numSubjects];

            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Subject " + (j + 1) + " code: ");
                subjectCodes[j] = sc.next();
                System.out.print("Subject " + (j + 1) + " credits: ");
                subjectCredits[j] = sc.nextInt();
                System.out.print("Grade obtained (A/B/C/D/F): ");
                grades[j] = sc.next().charAt(0);
            }

            students[i] = new Student(idNo, numSubjects, subjectCodes, subjectCredits, grades);
        }

        System.out.println("\nStudent details:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

   
    @Override
    public String toString() {
        return "ID: " + idNo + ", SPI: " + spi;
    }
}