import java.util.Scanner;
public class P10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=i; k>=1; k--){
                if(k==i){
                    System.out.print("*");
                }
                else{
                System.out.print(" *");
                }
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                if(k==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

    }
}
