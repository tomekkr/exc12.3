import java.util.ArrayList;
import java.util.List;

abstract class NumbersService {
    public static List<Integer> createNumbersList() {
        return new ArrayList<>();
    }

    public static List<Integer> reverseNumbers(List<Integer> numbers) {
        List<Integer> reversedNumbers = new ArrayList<>();
        for (int i = numbers.size(); i > 0; i--) {
            reversedNumbers.add(numbers.get(i - 1));
        }
        return reversedNumbers;
    }

    public static String sumAllNumbersAndPrint(List<Integer> numbers) {
        int sum = sumAllNumbers(numbers);
        String sumString = "";
        for (int i = 0; i < numbers.size(); i++) {
            sumString += numbers.get(i);
            if (i < (numbers.size()) - 1) {
                sumString += " + ";
            }
        }
        return sumString + " = " + sum;
    }

    public static int largestNumber(List<Integer> numbers) {
        int largestNumber = numbers.get(0);
        for (Integer number : numbers) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }
        return largestNumber;
    }

    public static int smallestNumber(List<Integer> numbers) {
        int smallestNumber = numbers.get(0);
        for (Integer number : numbers) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }
        return smallestNumber;
    }

    private static int sumAllNumbers(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
