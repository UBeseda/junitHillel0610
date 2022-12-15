// Cтворюємо данні для юзера і запускаємо тест "Form Test"
package data;

public class User {

  public User(String name, String email, String mobile, String subjects){
        this.name=name;
        this.email=email;
        this.mobile=mobile;
        this.subjects=subjects;
    }

    String name;
    String email;


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String  getMobile() {
        return mobile;
    }

    public String getSubjects() {
        return subjects;
    }

    String mobile;
    String subjects;

    public User() {
        this.name="Joe";
        this.email="joe@gmail.com";
        this.mobile="0506771122";
        this.subjects="test1, test2, test3";
    }
}
