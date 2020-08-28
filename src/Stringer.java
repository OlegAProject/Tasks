import java.util.*;

public class Stringer {

    private String forReverse;


    public Stringer() {
    }


    /* Переворачивание строки, изменив расположение символов в строке
     задом наперёд без использования встроенных в String функций */

    public String reverseByStringBuilder(String forReverse) {
        return new StringBuilder(forReverse).reverse().toString();
    }


    /* Переворачивание последовательности символов в строке без
    использования встроенной в String функции reverse() */

    public String  reverseByStringToChar(String forReverse) {

        char[] charArray = forReverse.toCharArray();
        char[] newCharArray = new char[charArray.length];
        String newString = "";

        //method #1
        for (int i = charArray.length - 1; i >= 0; i--) {
            newCharArray[charArray.length - i - 1] = charArray[i];
        }
        //method #2
        for (int i = charArray.length - 1; i >= 0; i--) {
            newString = newString.concat(String.valueOf(charArray[i]));
        }
        System.out.println(newString);

        return new String(newCharArray); //or return newString;
    }


    /* Подсчет количества конкретных слов в строке, используя HashMap */
    public HashMap<String, Integer> wordCounter(String text) {

        String[] words = text.replaceAll("[^a-zA-Z ]", "").split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String word:words) {
            if (hashMap.containsKey(word)) {
                int counter = hashMap.get(word);
                hashMap.put(word, counter++);
            } else {
                hashMap.put(word, 1);
            }
        }

        return hashMap;
    }

    /* Итерация объекта типа HashMap с использованием циклов while и for */
    public void wordIterator(String text) {

        String[] words = text.replaceAll("[^a-zA-Z ]", "").split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String word:words) {
            if (hashMap.containsKey(word)) {
                int counter = hashMap.get(word);
                hashMap.put(word, counter++);
            } else {
                hashMap.put(word, 1);
            }
        }

        Iterator it = hashMap.entrySet().iterator();

        System.out.println("\nCycle FOR:");
        for (Map.Entry element:hashMap.entrySet()) {
            System.out.println("Key: " + element.getKey() + "  " + "Value: " + element.getValue());
        }

        System.out.println("\nCycle WHILE:");
        while(it.hasNext()) {
            Map.Entry element = (Map.Entry) it.next();
            System.out.println("Key: " + element.getKey() + "  " + "Value: " + element.getValue());
        }
    }


    /* Определение является ли строка или число палиндромом, или нет */
    public boolean isPalindrome(String text) {

        String clearText = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        return clearText.equals(new Stringer().reverseByStringBuilder(clearText));
    }


    /* Поиск повторяющихся символов в строке */
    public void repeatingChars(String text) {

        char[] charArray = text.toLowerCase().toCharArray();
        HashMap<Character, Integer> repMap = new HashMap<>();

        for (char ch:charArray) {
            if (repMap.containsKey(ch)) {
                repMap.put(ch, repMap.get(ch) + 1);
            } else {
                repMap.put(ch, 1);
            }
        }

        System.out.println(repMap);
    }

    /* Удаление символа из строки с помощью replace() */
    public String deleteSymbol(String string, char symbol) {

        return string.replaceAll(String.valueOf(symbol), "");
    }
}


