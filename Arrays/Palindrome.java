package Arrays;

import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int target = x;
        while (x > 0) {
            int temp = x % 10;
            x = x / 10;
            sum = sum * 10 + temp;
        }
        return sum == target;
    }

    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome(x);
        System.out.println(result);
    }
}


//        int sum=0;
//         int target = x;
////         while(x<0){
////             System.out.println("false");
////             break;
////
////         }
//         while(x>0){
//             int temp =x%10;
//             x=x/10;
//             sum= sum*10+temp;
//         }
//         if(sum==target){
//             System.out.println("true");
//         }
//         else{
//             System.out.println("false");
//         }
//
//
//    }
//}
