import java.util.Scanner;
import java.util.Stack;
//Write a Java program to perform reverse a string using Stack data structure.
public class Ferrell_Problem1 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        System.out.println("reversed string: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}