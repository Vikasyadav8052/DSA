package Arrays;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = 1;
        for(int i = n; i>0;i--){
            y = y * i ;


        }
        System.out.println(y);
    }
}
