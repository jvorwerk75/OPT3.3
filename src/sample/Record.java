package sample;

public class Record {
    private Person person;
    private Boolean complete;
    private Boolean correct;

    public Record(Person person) {
        this.person = person;
        complete = completeRecordCheck();
        correct = syntaxCheck();

    }
    //deze methode bepaald of er een contract aanvraag gedaan mag worden
    public Boolean makeContractApplication(){
        if(complete && correct){
            return true;
        }else{
            return false;
        }
    }
    public Person getPerson(){return this.person;}
    public Boolean getComplete(){return this.complete;}
    public void setPerson(Person person) {
        this.person = person;
    }

    //check persoongegevens compleet zijn. Hierin zijn niet vereiste attributen weggelaten
    public Boolean completeRecordCheck() {
        if (person.getBirthdate().isEmpty()) {
            return false;
        }
        if (person.getGeslacht().isEmpty()) {
            return false;
        }
        if (person.getIban().isEmpty()) {
            return false;
        }
        if (person.getFirstName().isEmpty()) {
            return false;
        }
        if (person.getLastName().isEmpty()) {
            return false;
        }
        return true;
    }
    public Boolean syntaxCheck(){
        if(this.person.getBsn().length() != 9){
            return false;
        }
        if(countIbanNumbers(this.person.getIban()) != 12){
            return false;
        }
        if(this.person.getIban().length() != 18){
            return false;
        }
        return true;
    }
    public Integer countIbanNumbers(String iban){
        char[] ch = iban.toCharArray();
        Integer numbers = 0;
        for(int i = 0; i < iban.length(); i++){
            if(Character.isDigit(ch[i])){
                numbers++;
            }
        }
        return numbers;
    }
}

