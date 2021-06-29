package sample;

public class User {
    private String userName;
    private String password;
    private Boolean isHR;
    private Boolean isRecruitment;

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
        isHR = false;
        isRecruitment = false;
    }
    public Boolean getIsHr(){return this.isHR;}
    public Boolean getIsRecruitment(){return this.isRecruitment;}
    public String getUserName(){return this.userName;}
    public Boolean passwordAuthentication(String password){return password.equals(this.password);}
    public void makeHRWorker(){
        this.isHR = true;
    }
    public void makeRecruitmentWorker(){
        this.isRecruitment = true;
    }

}
