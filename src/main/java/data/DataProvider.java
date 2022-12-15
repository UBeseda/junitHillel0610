//В дата провайдері створюємо список для заповнення різних данних вручну
// і запускаємо тест "FormTestRandomFill"
package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataProvider {
    public static User getRandomUser(){
      List<User> userList=new ArrayList<>();
        userList.add(new User ("Lala", "lala@gmail.com", "12345677", "lala1, lala2, lala3"));
        userList.add(new User ("Duglas", "lala+1@gmail.com", "12345678", "lala4, lala5, lala6"));
        userList.add(new User("Milly", "lala+2@gmail.com", "12345679", "lala7, lala8, lala9"));
        userList.add(new User("Gron", "lala+3@gmail.com","12345670", "lala10, lala11, lala12"));
        return userList.get(new Random().nextInt(userList.size()));
     }
}


