package Arrays;
//import java.util.Scanner;
public class BasicExample {
    public static void main(String[] args) {
        int[] arr= {3,4,5,6,};
        for(int i =0;i< arr.length;i++){
            if(i%2==0) {
                arr[i] =arr[i]+10;
            }else {
                arr[i] =arr[i]* 2;
               // System.out.print(arr[i]+" ");
            }
        }
       for(int x:arr){
            System.out.print(x + " ");
        }

    }
}
