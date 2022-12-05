//Write a program to print the given string as is and in reverse using Linkedlist.
//Hint: Can use doubly linked list
import java.util.LinkedList;
import java.util.Scanner;

public class Ferrell_Problem2 {
    public static void main(String[] args) {
        //Declares a Linked List
        LinkedList<Character> list = new LinkedList<>();
        //Declares a Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        //Gets user input
        String input = scanner.nextLine();

        System.out.println("Printing string normally:");
        //adds the string to the list while printing it
        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
            System.out.print(list.get(i));
        }
        System.out.println();
        //iterates through the list backwards to print the string in reverse
        System.out.println("Printing string in Reverse: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
}
