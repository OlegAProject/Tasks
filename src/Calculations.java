import java.sql.Array;
import java.util.*;

public class Calculations {

    public Calculations() {
    }

    /* Определение является ли число простым или нет */
    public boolean isPrime(int digit) {
        boolean prime = false;

        for (int i = 2; i <= digit/2; i++) {
            if (digit % i == 0) {
                prime = true;
                break;
            }
        }

        return prime;
    }

    public long[] fibonacci() {

        System.out.println("Enter the Fibonacci sequence number: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        long[] sequence = new long[size];
        sequence[0] = 0;
        sequence[1] = 1;

        for (int i = 2; i < size; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        for (long digit:sequence) {
            System.out.print(digit + " ");
        }

        return sequence;
    }

    /* Обхода ArrayList с использованием цикла for и while */
    public ArrayList<Integer> listArray() {

        System.out.println("Enter an array of integers: ");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        while(scanner.hasNextInt()) {
            arrayList.add(scanner.nextInt());
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }

        return arrayList;
    }


    /* Поиск n-го по величине числа в массиве */
    public void highestNumberByPosition(int position) {

        System.out.println("Enter an array of integers: ");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        while(scanner.hasNextInt()) {
            array.add(scanner.nextInt());
        }

        Collections.sort(array);
        Collections.reverse(array);
        System.out.println(array);

        if (position >= 0 && position <= array.size()) {
            System.out.println(position + " largest number is " + array.get(position - 1));
        } else {
            System.out.println("Position is incorrect.");
        }
    }

    /* Проверка является ли введенное число - числом Армстронга */
    public boolean isArmstrong(int number) {

        int quantity = String.valueOf(number).length();
        int sum = 0;
        int[] parts = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            sum += Math.pow((int) number % 10, quantity);
            number = number / 10;
        }

        return sum == number;
    }

}
