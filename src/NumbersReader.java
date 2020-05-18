import java.util.List;
import java.util.Scanner;

abstract class NumbersReader {
    public static void readNumbersFromUser(List<Integer> numbers) {
        int userInput = 0;
        while (userInput >= 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę:");
            userInput = scanner.nextInt();
            if (userInput >= 0) {
                numbers.add(userInput);
            }
        }
    }
}
