import java.util.InputMismatchException;
import java.util.List;

class Test {
    public static void main(String[] args) {
        try {
            List<Integer> numbers = NumbersService.createNumbersList();
            NumbersReader.readNumbersFromUser(numbers);
            if (numbers.isEmpty())
                throw new IndexOutOfBoundsException("Lista liczb jest pusta");

            System.out.println("Wprowadzone liczby: " + numbers);

            List<Integer> reversedNumbers = NumbersService.reverseNumbers(numbers);
            System.out.println("Wprowadzone liczby w odwróconej kolejności: " + reversedNumbers);

            System.out.println(NumbersService.sumAllNumbersAndPrint(numbers));

            System.out.println("Najmniejsza liczba: " + NumbersService.smallestNumber(numbers));
            System.out.println("Największa liczba: " + NumbersService.largestNumber(numbers));
        } catch (InputMismatchException e) {
            System.err.println("Wpisana wartość nie jest liczbą całkowitą");
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
