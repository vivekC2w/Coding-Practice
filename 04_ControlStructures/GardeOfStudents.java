import java.util.Scanner;

public class GardeOfStudents {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int avg, sum = 0;
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            // System.out.println(marks[i]);
            sum = sum + marks[i];
        }
        avg = sum / 5;
        // System.out.println(avg);
        if (avg >= 40 && avg < 60) {
            System.out.println('C');
        } else if (avg >= 60 && avg < 80) {
            System.out.println('B');
        } else if (avg >= 80) {
            System.out.println('A');
        } else {
            System.out.println('D');
        }

    }
}
