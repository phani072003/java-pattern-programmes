import java.util.Scanner;
public class P2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=n; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("*" + " ");
            }
             System.out.println();
        }
       
    }
}