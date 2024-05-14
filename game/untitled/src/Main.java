import java.util.Scanner;

public class Main {
    private static String[] words = {"яблуко", "банан", "апельсин", "виноград", "ананас"};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int attempts = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (attempts < 7 && asterisk.contains("*")) {
            System.out.println("Вгадайте будь-яку літеру в слові");
            System.out.println(asterisk);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }

    public static void hang(String guess) {
        String newAsterisk = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newAsterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '*') {
                newAsterisk += word.charAt(i);
            } else {
                newAsterisk += "*";
            }
        }

        if (asterisk.equals(newAsterisk)) {
            attempts++;
            drawHangman();
        } else {
            asterisk = newAsterisk;
        }
        if (asterisk.equals(word)) {
            System.out.println("Правильно! Ви виграли! Слово було " + word);
        }
    }

    public static void drawHangman() {
        if (attempts == 1) {
            System.out.println("Неправильне вгадування, спробуйте ще раз");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("______");
        }
        if (attempts == 2) {
            System.out.println("Неправильне вгадування, спробуйте ще раз");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("___|__");
        }
        if (attempts == 3) {
            System.out.println("Неправильне вгадування, спробуйте ще раз");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("___|__");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("   |  ");
            System.out.println("___|__");
        }
        if (attempts == 4) {
            System.out.println("Неправильне вгадування, спробуйте ще раз");
            System.out.println("   ___________");
            System.out.println("   |         |");
            System.out.println("   |         |");
            System.out.println("   |         |");
            System.out.println("   |         |");
            System.out.println("___|__     __|___");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("___|___________|___");
        }
        if (attempts == 5) {
            System.out.println("Неправильне вгадування, спробуйте ще раз");
            System.out.println("   ___________");
            System.out.println("   |         |");
            System.out.println("   |         |");
            System.out.println("   |         |");
            System.out.println("   |         |");
            System.out.println("___|__     __|___");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("___|___________|___");
            System.out.println("               |");
            System.out.println("               |");
            System.out.println("               |");
            System.out.println("               |");
            System.out.println("_______________|__");
        }
        if (attempts == 6) {
            System.out.println("Неправильне вгадування, спробуйте ще раз");
            System.out.println("   ___________");
            System.out.println("   |         |");
            System.out.println("   |         |");
            System.out.println("   |         |");
            System.out.println("   |         |");
            System.out.println("___|__     __|___");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("___|___________|___");
            System.out.println("               |");
            System.out.println("               |");
            System.out.println("               |");
            System.out.println("               |");
            System.out.println("_______________|__");
            System.out.println("Гра закінчена! Слово було " + word);
        }
    }
}
