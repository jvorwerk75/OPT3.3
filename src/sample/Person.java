package sample;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String birthdate;
    private String geslacht;
    private String iban;
    private String bsn;
    private Salary salary;
    private ApplicantInfo applicantInfo;

    public Person(String firstName, String middleName, String lastName, String birthdate, String geslacht, String iban, String bsn, ApplicantInfo applicantInfo){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.geslacht = geslacht;
        this.iban = iban;
        this.bsn = bsn;
        this.applicantInfo = applicantInfo;
        this.salary = createSalary();
    }

    public void setLastName(String lastName){this.lastName = lastName;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setMiddleName(String middleName){this.middleName = middleName;}
    public void setBirthdate(String birthdate){this.birthdate = birthdate;}
    public void setGeslacht(String geslacht){this.geslacht = geslacht;}
    public void setIban(String iban){this.iban = iban;}
    public void setBSN(String bsn){this.bsn = bsn;}
    public String getFullName(){return this.firstName + " " + this.middleName + " " + this.lastName;}
    public String getFirstName(){return this.firstName;}
    public String getMiddleName(){return this.middleName;}
    public String getLastName(){return this.lastName;}
    public String getBirthdate(){return this.birthdate;}
    public String getGeslacht(){return this.geslacht;}
    public String getIban(){return this.iban;}
    public String getBsn(){return this.bsn;}

    public Salary createSalary(){
        Double amount;
        if(applicantInfo.getYearsExperience() < 4){
            amount = 2275.00;
        }else if(applicantInfo.getYearsExperience() > 3 && applicantInfo.getYearsExperience() < 11){
            amount = 2500.00;
        }else if(applicantInfo.getYearsExperience() > 10){
            amount = 3000.00;
        }else{
            amount = null;
        }
        Salary salary = new Salary(applicantInfo.getFulltime(),amount);
        return salary;
    }



}
