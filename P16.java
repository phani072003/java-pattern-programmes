import java.util.Scanner;
public class P16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i=1; i<=n1; i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1; i<=n2-2; i++){
           for(int j= 1; j<=n1-15; j++){
            if(j==1){
                System.out.print("* ");
            }
            else{
            System.out.print("  ");
            }
           }
           System.out.print("*");
           System.out.println();
        }
        for(int k=1; k<=n1; k++){
            System.out.print("* ");
        }
    }
}
