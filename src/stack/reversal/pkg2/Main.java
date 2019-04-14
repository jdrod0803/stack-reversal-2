package stack.reversal.pkg2;
/**
 *
 * Title: Stacks for a Poem Reversal COP3804 – Spring 2019
 *
 * @author 6114243(Do NOT Use Your First or Last Name) Instructor: C. Charters
 *
 * Due Date: 04/07/19
 *
 *  Learning to use stacks, pushing and popping.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    /**
     * Variables
     */
    private Scanner scanner;
    private Stack stack = new Stack();

    private Main() {
        loadStack();
    }

    /**
     * Loads stack.
     */
    private void loadStack() {
        //Inst scanner and file
        try {
            scanner = new Scanner(new File("file.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong reading the file.");
            e.printStackTrace();
        }
        //Read here
        while (scanner.hasNext()) {
            //Take scanner input and split into array
            String[] in = scanner.nextLine().split(" ");

            //Iterate through the array and push to stack.
            for (int i = 0; i < in.length; i++) {
                String s = in[i];
                //Extra credit
                if (i == in.length - 1) {
                    s = s.substring(0, 1).toUpperCase() + s.substring(1);
                }
                stack.push(s);
            }
            printStack();
        }
    }

    /**
     * Prints stack.
     */
    private void printStack() {
        //Iterate through the stack, ensuring it is not empty to avoid npe
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
            System.out.print(" ");
        }
        System.out.println("\n");
    }

    /**
     * main
     * @param args commandline arguments
     */
    public static void main(String[] args) {
        new Main();
    }

}
