import java.util.Scanner;

public class work6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[5];

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();

            sum = sum + scores[i];
        }

        double average = (double) sum / 5;

        System.out.println("Total score = " + sum);
        System.out.println("Average score = " + average);

        scanner.close();
    }
}