import java.util.Scanner;
public class P7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++){
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
