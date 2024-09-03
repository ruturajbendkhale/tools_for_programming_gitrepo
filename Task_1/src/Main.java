import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words:");

        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split("\\s+");
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest parameter: " + longest);
    }
}