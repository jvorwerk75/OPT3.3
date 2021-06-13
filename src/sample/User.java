package sample;

public class User {
    private String userName;
    private String password;
    private boolean isHR;
    private boolean isRecruitment;

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
        isHR = false;
        isRecruitment = false;
    }
    public boolean getIsHr(){return this.isHR;}
    public boolean getIsRecruitment(){return this.isRecruitment;}
    public String getUserName(){return this.userName;}
    public Boolean passwordAuthentication(String password){return password.equals(this.password);}
    public void makeHRWorker(){
        this.isHR = true;
    }
    public void makeRecruitmentWorker(){
        this.isRecruitment = true;
    }

}
