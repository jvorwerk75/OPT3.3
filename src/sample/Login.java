package sample;

import java.util.ArrayList;
import java.util.Scanner;

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
    private User getUser(String email){
        for(User user: users){
            if(user.getUserName().equals(email)){
                return user;
            }
        }
        return null;
    }
    public Boolean userIsAuthenticated(){
        return loggedInUser != null;
    }
    public Boolean  isAuthenticated(){
        if(userIsAuthenticated()){
            return true;
        }
        else{
            Scanner scanner = new Scanner(System.in);
            Logging logging = Logging.getInstance();

            for(int i = 0; i < 3; i++){
                System.out.println("LOG IN");
                System.out.println("Met welke E-mail wilt u inloggen? ");
                String email = scanner.nextLine();
                System.out.println("Wat is het bijbehorden wachtwoord? ");
                String password = scanner.nextLine();

                User user = getUser(email);

                if(user != null && user.passwordAuthentication(password)){
                    this.loggedInUser = user;
                    logging.printLog("gebruiker is ingelogd");
                    System.out.println("");
                    return true;
                }
                System.out.println("De combinatie van email en wachtwoord zijn niet correct. ");
                logging.printLog(String.format("Het is gebruiker met email '%s' niet gelukt om in te loggen", email));
            }
            System.out.println("=============");
            System.out.println("");
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
