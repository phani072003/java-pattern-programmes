import java.util.Scanner;
public class P20 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int x = 1;
            for(int j=0; j<n-i; j++){
                System.out.print("  ");
            }
            for(int k=0; k<=i; k++){
                System.out.print(x + "   ");
                x = x*(i-k)/(k+1);
            }

            System.out.println();
        }
    }
}
