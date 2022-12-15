package data;

public class User3 {
    String name;

    public User3 (String name, int mobile)  {
        this.name=name;
        this.mobile=mobile;
    }


    public String getName() {
        return name;
    }

    public int getMobile() {
        return mobile;
    }

    int mobile;


    public User3() {
        this.name="Joe";
        this.mobile=0506771122;
    }
}

