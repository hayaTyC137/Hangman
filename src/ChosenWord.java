import java.util.*;
public class ChosenWord {
     public static void getWord(){
        // тут пользователь будет выбирать слово
         Random random = new Random();
        List<String> listOfWords = new ArrayList<>(Arrays.asList(
           "подарок", "звонок", "телефон", "платье"
        ));
        String randomWordFromList = listOfWords.get(random.nextInt(listOfWords.size()));
        System.out.println(randomWordFromList);
     }
}
