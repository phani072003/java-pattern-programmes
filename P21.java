import java.util.Scanner;
public class P21{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alpha = 64;
        sc.close();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print( (char)(alpha + j) + " ");
            }
             System.out.println();
        }
       
    }
}