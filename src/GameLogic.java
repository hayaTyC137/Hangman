import java.util.*;
public class GameLogic {
    public static int counterOfMisses;
    public static char[] hiddenWord;

    public static void guessChar(String givenWord){
        Scanner sc = new Scanner(System.in);


        System.out.println("Введите букву: ");
        char guessOfPlayer = sc.next().charAt(0);
        char[] givenWordInArr = givenWord.toCharArray();
        boolean isCorrect = false;

        if (hiddenWord == null) {
            char[] hiddenWord = new char[givenWord.length()];
            // Заполняем подчеркиваниями
            Arrays.fill(hiddenWord, '_');
        }
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