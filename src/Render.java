import java.util.Scanner;

public class Render {
    public static void game(){
        boolean gameIsOver = false;
        while (!gameIsOver) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Здравствуйте, хотите сыграть в игру?");
            char chosePlayer = scan.next().charAt(0);
            if (chosePlayer == 'Y') {
                System.out.println("Давай");
            } else if (chosePlayer == 'N') {
                System.out.println("Нет, спасибо");
            }
            // у меня есть слово, на местах его букв должны отображатся "_"
            System.out.println("Загаданное слово: " + ChosenWord.getWord().replaceAll(".", "_"));
            switch (GameLogic.counterOfMisses){
                case 0:
                    HangManStages.render_hangman_stages(GameLogic.counterOfMisses);
                    continue;
                case 1:
                    HangManStages.render_hangman_stages(GameLogic.counterOfMisses);
                    continue;
                case 2:
                    HangManStages.render_hangman_stages(GameLogic.counterOfMisses);
                    continue;
                case 3:
                    HangManStages.render_hangman_stages(GameLogic.counterOfMisses);
                    continue;
                case 4:
                    HangManStages.render_hangman_stages(GameLogic.counterOfMisses);
                    continue;
                case 5:
                    HangManStages.render_hangman_stages(GameLogic.counterOfMisses);
                    continue;
                case 6:
                    HangManStages.render_hangman_stages(GameLogic.counterOfMisses);
                    continue;
                case 7:
                    HangManStages.render_hangman_stages(GameLogic.counterOfMisses);
            }
        }
    }
}
