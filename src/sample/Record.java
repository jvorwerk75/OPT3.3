package sample;

public class Record {
    private Person person;
    private Boolean complete = true;

    public Record(Person person) {
        this.person = person;
        completeRecordCheck();
    }

    public Person getPerson(){return this.person;}
    public Boolean getComplete(){return this.complete;}
    public void setPerson(Person person) {
        this.person = person;
    }

    //check persoongegevens compleet zijn. Hierin zijn niet vereiste attributen weggelaten
    public void completeRecordCheck() {
        if (person.getBirthdate().isEmpty()) {
            complete = false;
        }
        if (person.getGeslacht().isEmpty()) {
            complete = false;
        }
        if (person.getIban().isEmpty()) {
            complete = false;
        }
        if (person.getFirstName().isEmpty()) {
            complete = false;
        }
        if (person.getLastName().isEmpty()) {
            complete = false;
        }
    }
}

