package sample;

public class User {
    private String userName;
    private String password;

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public String getUserName(){return this.userName;}
    public Boolean passwordAuthentication(String password){
        return password.equals(this.password);
    }
}
