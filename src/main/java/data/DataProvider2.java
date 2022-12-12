//Написать Data Provider который содержит 2 метода: getRandomString() и getRandomInt()

package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataProvider2 {

    public static User2 getRandomString(){
        List<User2> stringList = new ArrayList<>();
        stringList.add(new User2("Kiko", "0506771121"));
        stringList.add(new User2("Ziko", "0506771120"));
        stringList.add(new User2("Diko", "0506771122"));


        return stringList.get(new Random().nextInt(stringList.size()));
    }

    // Не знаю, як запустити тест на практичній формі з getRandomInt (бо в формі ми тік стрінгові поля перевіряли поки - а в контструкторі мутила з int - не вийшло((
   public static Integer getRandomInt() {
          List<Integer> intList = new ArrayList<>();
          intList.add(123456789);
          intList.add(987654321);

          return intList.get(new Random().nextInt(intList.size()));
    }
}
