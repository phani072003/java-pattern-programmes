import java.util.Scanner;
public class P19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean b = true;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(b){
                    b = false;
                    System.out.print("1 ");
                }
                else{
                    b = true; 
                    System.out.print("0 ");

                }
            }
             System.out.println();
        }
       
    }
}