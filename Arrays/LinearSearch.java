package Arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 2,4,5,7,12,43,65};
        int target = 23;
        boolean found = false;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==target){
                found=true;
                break;
            }
        }
        if(found) System.out.println("target is exist ");
        else
            System.out.println("target is not exsiting : ");
            }
        }



