package sample;

import java.util.ArrayList;

public class Login {
    private static Login singeleton;
    private ArrayList<User> users;
    private User loggedInUser;

    private Login(){
        users = new ArrayList<> ();
        users.add(new User ("a", "b"));
        users.add(new User ("a", "b"));
        loggedInUser = null;
    }

    public static Login getInstance(){
        if(singeleton == null){
            singeleton = new Login();
        }
        return singeleton;
    }
    private Boolean userExists (String userName){
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getUserName().equals(userName)){
                this.loggedInUser = users.get(i);
                return true;
            }
        }
        return false;
    }
    public Boolean userIsAuthenticated(){
        return loggedInUser != null;
    }
    public Boolean  isAuthenticated(){
        if(userIsAuthenticated()){
            return true;
        }
        else{
            //TODO Log in methode.


            return false;
        }
    }
    public String getUsername(){
        if(loggedInUser == null){
            return "";
        }
        return loggedInUser.getUserName();
    }
}
