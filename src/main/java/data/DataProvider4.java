package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataProvider4 {
    static List<String> stringList = new ArrayList<>();
    static List<Integer> intList = new ArrayList<>();


    static {
        stringList.add("Name1");
        stringList.add("Name2");

        intList.add(123456789);
        intList.add(987654321);
    }

    public static String getRandomString() {
        return stringList.get(new Random().nextInt(stringList.size()));
    }

    public static Integer getRandomSInt() {
        return intList.get(new Random().nextInt(intList.size()));
    }
}