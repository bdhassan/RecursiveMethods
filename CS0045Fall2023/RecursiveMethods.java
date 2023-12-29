package CS0045Fall2023;

import java.util.Arrays;

public class RecursiveMethods {

    public static void countUp(int n){
        if(n > 0){
            countUp(n - 1);
            System.out.print(n + " ");
        }
    }
    public static int factorial(int n){
        if(n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        if( str.length() <= 1) {
            return true;
        }
        else{
            return str.charAt(0) == str.charAt(str.length() - 1)
                    && isPalindrome(str.substring(1, str.length() - 1));
        }
    }

    public static int sum(int[] arr) { //arr {1,2,3,4,5}
        if (arr.length == 0) {
            return 0;
        } else {
            return arr[arr.length - 1] + sum(Arrays.copyOf(arr, arr.length - 1));
        }
    }

    public static int frequency(int[] arr, int target) {
        if (arr.length == 0) {
            return 0;
        } else {
            int count = (arr[arr.length - 1] == target) ? 1 : 0;
            return count + frequency(Arrays.copyOf(arr, arr.length - 1), target);
        }
    }

    public static void main(String[] args) {

        System.out.println("countUp : ");

        countUp(21);

        System.out.println("\nFactorial:" + factorial(9));

        System.out.println("isPalindrome :");
        System.out.println(isPalindrome("Radar"));
        System.out.println(isPalindrome("Ra?dar"));
        System.out.println(isPalindrome("Raddar"));
        System.out.println(isPalindrome("raddgar"));

        System.out.println("sum: " + sum(new int[]{1, 9, 2, 7, 2, 11, 8, 10, 2, 5}));
        System.out.println("sum: " + sum(new int[]{11, 5, 6, 2, 9, 7, 5}));
        System.out.println("sum: " + sum(new int[]{5, 6, 2, 9, 7, 5, 11}));

        System.out.println("frequency: ");
        System.out.println(frequency(new int[]{1, 9, 2, 7, 2, 11, 8, 10, 2, 5}, 2)); // 3
        System.out.println(frequency(new int[]{1, 9, 2, 7, 2, 11, 8, 10, 2, 5}, 8)); // 1
        System.out.println(frequency(new int[]{1, 9, 2, 7, 2, 11, 8, 10, 2, 5}, 4)); // 0
    }
}

    






