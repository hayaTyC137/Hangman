import java.util.*;
public class ChosenWord {
     public static String getWord(){
        // тут пользователь будет выбирать слово
         Random random = new Random();
        List<String> listOfWords = new ArrayList<>(Arrays.asList(
           "подарок", "звонок", "телефон", "платье"
        ));
         return listOfWords.get(random.nextInt(listOfWords.size()));
     }
}
