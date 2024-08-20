import java.util.Scanner;

public class Tasksheet116 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter words:");
        String input = scan.nextLine();
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();

        if (input.equals(reversed.toString())){
            System.out.println("The input is Palindrome.");
        } else {
            System.out.println("The input is not Palindrome.");
        }
    }
}
