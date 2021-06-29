package sample;
import java.util.ArrayList;

public class PersonInfo {
    private String firstName;
    private String lastName;
    private String middleName;
    private String birthdate;
    private String gender;
    private String iban;
    private String bsn;
    public PersonInfo(ArrayList<String> info){
        this.firstName = info.get(0);
        this.lastName = info.get(1);
        this.middleName = info.get(2);
        this.birthdate = info.get(3);
        this.gender = info.get(4);
        this.iban = info.get(5);
        this.bsn = info.get(6);
    }
    public String getBirthdate() {
        return birthdate;
    }

    public String getBsn() {
        return bsn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getIban() {
        return iban;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }
}
