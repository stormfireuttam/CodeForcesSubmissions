package CodeForcesRound686Div3.Program1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.print(n + " ");
            for (int i = 1; i < n; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
