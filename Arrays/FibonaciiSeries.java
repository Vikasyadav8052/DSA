package Arrays;

public class FibonaciiSeries {
    public static void main(String[] args) {
        int  n = 5;
        int first = 0,Second = 1;
        System.out.println("fibonacii series up to" + n + " ");
        for(int i = 0;i<n; i++){
            System.out.println(first + " ");
            int next = first + Second;
            first = Second;
            Second = next;

        }
    }
}
