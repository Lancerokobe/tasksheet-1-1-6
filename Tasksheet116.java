public class Tasksheet116 {
    public static void main(String[] args) {
        String input = "haha";
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();

        if (input.equals(reversed.toString())){
            System.out.println("The input is Palindrome.");
        } else {
            System.out.println("The input is not Palindrome.");
        }
    }
}
