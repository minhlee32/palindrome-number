import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        int a;
        System.out.println("Please enter a number");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        System.out.println(isPalinddromeInteger(a));


    }
    private static int reverse(int a) {
        int b = 0;
        int c;
        for (int i = 0; i < a; i++) {
            while (a > 0) {
                c = a % 10;
                b = b * 10 + c;
                a /= 10;
            }
        }
        return b;
    }

    private static boolean isPalinddromeInteger(int a) {
        if (a == reverse(a)) {
            System.out.println(a + " is a palindrome number");
            return true;
        }
        else {
            System.out.println(a + " is not a palindrome number");
            return false;
        }
    }
}
