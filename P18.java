import java.util.Scanner;

public class P18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int x = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                x = x + 1;
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}