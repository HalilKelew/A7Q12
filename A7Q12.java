// By Halil Keles 4/7/21

package Assignments;
import java.util.Scanner;


public class A7Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        StringBuilder sb = new StringBuilder(word);
        if (word.startsWith("x"))
        {sb.deleteCharAt(0);
            System.out.println(sb);
        }
        else if (word.startsWith("X"))
        {sb.deleteCharAt(0);
            System.out.println(sb);
        }
        else if (word.endsWith("x"))
        {sb.deleteCharAt(word.length() - 1);
            System.out.println(sb);
        }
        else if (word.endsWith("X"))
        {sb.deleteCharAt(word.length() - 1);
            System.out.println(sb);
        }
        else
            System.err.print("Services not available");

    }
}
