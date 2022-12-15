//Написать Data Provider который содержит 2 метода: getRandomString() и getRandomInt()
package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataProvider3 {

    public static User3 getRandomString(){
        List<User3> stringList = new ArrayList<>();
        stringList.add(new User3("Kiko", 0506771121));
        stringList.add(new User3("Ziko", 0506771120));
        stringList.add(new User3("Diko", 0506771122));

        return stringList.get(new Random().nextInt(stringList.size()));
    }
    // Не знаю, як запустити тест на практичній формі з getRandomInt (бо в формі ми тік стрінгові поля перевіряли поки - а в контструкторі мутила з int - не вийшло((
    public static User3 getRandomInt() {
        List<User3> intList = new ArrayList<>();
        intList.add(new User3("Kle", 138));
        intList.add(new User3("lala", 139));

        return intList.get(new Random().nextInt(intList.size()));
    }
}

