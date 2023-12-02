import java.util.Scanner;
public class P13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i>1){
                int k=2*(i-1) - 1;
                for(int x=1; x<=k; x++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
