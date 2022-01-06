import java.util.Arrays;
import java.util.Scanner;

class Triples {
    public static void main(String[] args) {
        // put your code here
        
                Scanner scanner = new Scanner(System.in);
        // start coding here

        int ele = scanner.nextInt();
        int[] arr = new int[ele];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        //System.out.println(Arrays.toString(arr));

        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (((arr[i] + 1) == arr[i+1]) && ((arr[i]+2) == arr[i+2])) {
                count++;
            }
        }

        System.out.println(count);
    }
}
