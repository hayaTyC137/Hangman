import java.util.*;
public class GameLogic {
    public static int counterOfMisses;
    public static char[] hiddenWord;

    public static void guessChar(String givenWord){

        Scanner sc = new Scanner(System.in);

        boolean validInput = false;
        char guessOfPlayer = ' ';

        while (!validInput) {
            System.out.println("Введите букву: ");
            String input = sc.nextLine();
            if (input.length() == 1){
                guessOfPlayer = input.charAt(0);
                if (Character.isLetter(guessOfPlayer)){
                    validInput = true; // правильный ввод буквы
                } else {
                    System.out.println("Введите букву а не цифру");
                }
            }
            else {
                System.out.println("Введите только 1 символ! ");
            }
        }

        char[] givenWordInArr = givenWord.toCharArray();
        boolean isCorrect = false;


        for (int i = 0; i < givenWordInArr.length; i++) {
            if (givenWordInArr[i] == guessOfPlayer) {
                hiddenWord[i] = guessOfPlayer;
                isCorrect = true;
            }
        }
        if(!isCorrect){
            System.out.println("Тут нет такой буквы!");
            counterOfMisses++;
        }
        else {
            System.out.println("Вы угадали букву");
        }
        System.out.println("Загаданное слово: " + new String(hiddenWord));
    }
}