package sample;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String birthdate;
    private String geslacht;
    private String iban;
    private String bsn;

    public Person(String firstName, String middleName, String lastName, String birthdate, String geslacht, String iban, String bsn){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.geslacht = geslacht;
        this.iban = iban;
        this.bsn = bsn;
    }

    public void setLastName(String lastName){this.lastName = lastName;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setMiddleName(String middleName){this.middleName = middleName;}
    public void setBirthdate(String birthdate){this.birthdate = birthdate;}
    public void setGeslacht(String geslacht){this.geslacht = geslacht;}
    public void setIban(String iban){this.iban = iban;}
    public String getFullName(){return this.firstName + " " + this.middleName + " " + this.lastName;}
    public String getFirstName(){return this.firstName;}
    public String getMiddleName(){return this.middleName;}
    public String getLastName(){return this.lastName;}
    public String getBirthdate(){return this.birthdate;}
    public String getGeslacht(){return this.geslacht;}
    public String getIban(){return this.iban;}


}
