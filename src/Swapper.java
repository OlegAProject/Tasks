import java.util.Scanner;

public class Swapper {

    public Swapper() {
    }


    /* Поменять местами значения, хранящиеся в двух переменных
     с помощью третьей переменной (isTemp = True) */
    /* Поменять местами значения, хранящиеся в двух переменных,
     без использования третьей переменной (temp = False) */
    public void swap(boolean isTemp) {

        System.out.println("Enter values a and b: ");

        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long temp;

        System.out.println("Before values swap: " + a + " " + b);

        if (isTemp) {
            temp = a;
            a = b;
            b = temp;
        } else {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        System.out.println("After values swap: " + a + " " + b);
    }
}
