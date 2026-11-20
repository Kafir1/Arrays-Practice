import java.util.Scanner;
public class TestScores {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] scores = new int[5];
        int pass = 0;
        int fail = 0;
        double avg = 0;
        System.out.println("Enter 5 test scores (0-100): ");
        for (int i=0; i<5; i++){
            System.out.print(i+1 + ": ");
            int score = in.nextInt();
            if (score<0 || score>100){
                System.out.println("Invalid input. Try again.");
                i--;
            }
            else {
                scores[i] = score;
                if (score>=60)
                    pass++;
                else {
                    fail++;
                }
            }
        }
        System.out.println();
        System.out.print("Scores: ");
        for (double i : scores) {
            System.out.print(i + " ");
            avg += i / 5;
        }
        System.out.println();
        System.out.println("Passed: " + pass);
        System.out.println("Failed: " + fail);
        System.out.println("Average: " + avg);
    }
}
