import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class UC6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        // Creating Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);      // Enqueue
            stack.push(ch);     // Push
        }

        System.out.println("\nComparing Dequeue (Queue) and Pop (Stack):");

        boolean isPalindrome = true;

        // Compare dequeue and pop
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();  // Dequeue
            char fromStack = stack.pop();     // Pop

            System.out.println("Queue: " + fromQueue +
                    " | Stack: " + fromStack);

            if (fromQueue != fromStack) {
                isPalindrome = false;
            }
        }

        // Result
        if (isPalindrome) {
            System.out.println("\nIt is a Palindrome!");
        } else {
            System.out.println("\nNot a Palindrome!");
        }

        sc.close();
    }
}