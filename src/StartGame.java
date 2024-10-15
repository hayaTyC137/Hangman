import java.util.Scanner;
public class StartGame {
    public static void main(String[] args) {

        boolean gameIsOver = false;
        while (!gameIsOver) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Здравствуйте, хотите сыграть в игру?");
            char chosePlayer = scan.next().charAt(0);
            if (chosePlayer == 'Y') {
                System.out.println("Давай");
            }
            else if (chosePlayer == 'N') {
                System.out.println("Нет, спасибо");
            }
        }
    }
}