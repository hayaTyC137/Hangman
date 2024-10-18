import java.util.Scanner;
public class Render {
    public static void game() {
        boolean gameIsOver = false;
        Scanner scan = new Scanner(System.in);

        while (!gameIsOver) {
            System.out.println("Здравствуйте, хотите сыграть в игру?");

            char chosePlayer = scan.next().charAt(0);
            boolean chosePlayerCorrect = false;

            while (!chosePlayerCorrect) {
                if (chosePlayer == 'Y'  || chosePlayer == 'y') {
                    System.out.println("Давай");
                    chosePlayerCorrect = true;
                } else if (chosePlayer == 'N' || chosePlayer == 'n') {
                    System.out.println("Нет, спасибо");
                    gameIsOver = true;
                    chosePlayerCorrect = true;
                    //break;
                } else {
                    System.out.println("Нет такого варината, попробуйте снова: ");
                    chosePlayer = scan.next().charAt(0);
                }
            }

            // Загаданное слово
            String word = ChosenWord.getWord();
            System.out.println("Данное слово: " + word.replaceAll(".", "_"));
            // Устанавливаем начальное состояние игры
            GameLogic.counterOfMisses = 0;
            GameLogic.hiddenWord = new char[word.length()]; // Инициализация скрытого слова

            for (int i = 0; i < word.length(); i++) {
                GameLogic.hiddenWord[i] = '_'; // Заполняем прочерками
            }

            // Цикл игры
            while (GameLogic.counterOfMisses < 6 && !new String(GameLogic.hiddenWord).equals(word)) {
                // Угадываем букву
                GameLogic.guessChar(word);

                // Рисуем виселицу в зависимости от количества ошибок
                HangManStages.render_hangman_stages(GameLogic.counterOfMisses);
            }

            // Результат игры
            if (GameLogic.counterOfMisses >= 6) {
                System.out.println("Вы проиграли! Загаданное слово было: " + word);
            } else {
                System.out.println("Вы победили!");
            }
        }
    }
}