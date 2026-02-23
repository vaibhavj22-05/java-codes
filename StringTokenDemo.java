import java.util.StringTokenizer;
import java.util.Scanner;

public class StringTokenDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a long string:");
        String input = sc.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(input);

        System.out.println("\nTokens are:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        sc.close();
    }
}