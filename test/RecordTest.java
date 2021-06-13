
import org.junit.jupiter.api.Test;
import sample.Person;
import sample.Record;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RecordTest {

    // condition coverage
    // elke voorwaarden wordt op true en false getest
    String firstName = "Jasper";
    String middleName = "Yvo Manfred";
    String lastName = "Vorwerk";
    String birthDate = "20-3-1998";
    String gender = "man";
    String iban = "NLV9RABO0123456789";
    String bsn = "12345678";
    ArrayList<String> info1 = new ArrayList<String>();
    public void addToArray(){
        info1.add(firstName);
        info1.add(middleName);
        info1.add(lastName);
        info1.add(birthDate);
        info1.add(gender);
        info1.add(iban);
        info1.add(bsn);
    }
    @Test
    void conditionCoverage1(){
        this.iban = "NLV9RABO0123456789";
        this.bsn = "12345678";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertFalse(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void conditionCoverage2(){
        this.iban = "L19RABO0123456789";
        this.bsn = "12345678";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertFalse(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertFalse(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void conditionCoverage3(){
        this.iban = "NL9RABO0123456789";
        this.bsn = "123456789";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertFalse(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }

    //Decistion Coverage
    //elke uitkomst wordt gecontroleerd

    @Test
    void decisionCoverage1(){
        this.iban = "NLV9RABO0123456789";
        this.bsn = "123456789";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void decisionCoverage2(){
        this.iban = "NL19RABO0123456789";
        this.bsn = "123456789";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertTrue(record.makeContractApplication());
    }

    //Condition/Decision coverage
    //Alle voorwaarden en uitkomsten zijn false of true;

    @Test
    void conditionDecisionCoverage1(){
        this.iban = "NL9RABO0123456789";
        this.bsn = "12345678";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertFalse(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertFalse(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void conditionDecisionCoverage2(){
        this.iban = "NL19RABO0123456789";
        this.bsn = "123456789";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertTrue(record.makeContractApplication());
    }

    //Modified condition/decision coverage
    //Er wordt getest of 1 specifieke voorwaarde impact heeft op D

    @Test
    void modifiedConditionDecisionCoverage1(){
        this.iban = "NL19RABO0123456789";
        this.bsn = "123456789";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertTrue(record.makeContractApplication());
    }
    @Test
    void modifiedConditionDecisionCoverage2(){
        this.iban = "NL19RABO0123456789";
        this.bsn = "12345678";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertFalse(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void modifiedConditionDecisionCoverage3(){
        this.iban = "NLV9RABO0123456789";
        this.bsn = "123456789";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void modifiedConditionDecisionCoverage4(){
        this.iban = "L19RABO0123456789";
        this.bsn = "123456789";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertFalse(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }

    //Multiple Condition Coverage
    //Alle mogelijke combinaties worden getest

    @Test
    void multipleConditionCoverage1(){
        this.iban = "NL9RABO0123456789";
        this.bsn = "12345678";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertFalse(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertFalse(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void multipleConditionCoverage2(){
        this.iban = "NLV9RABO0123456789";
        this.bsn = "12345678";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertFalse(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void multipleConditionCoverage3(){
        this.iban = "N19RABO0123456789";
        this.bsn = "12345678";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertFalse(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertFalse(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void multipleConditionCoverage4(){
        this.iban = "NL19RABO0123456789";
        this.bsn = "12345678";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertFalse(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void multipleConditionCoverage5(){
        this.iban = "NL9RABO0123456789";
        this.bsn = "123456789";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertFalse(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void multipleConditionCoverage6(){
        this.iban = "NLV9RABO0123456789";
        this.bsn = "123456789";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void multipleConditionCoverage7(){
        this.iban = "L19RABO0123456789";
        this.bsn = "123456789";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertFalse(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void multipleConditionCoverage8(){
        this.iban = "NL19RABO0123456789";
        this.bsn = "123456789";
        addToArray();
        Person person = new Person(info1, null);
        Record record = new Record(person, "");
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertTrue(record.makeContractApplication());
    }

    public Integer numberCount(String string){
        char[] ch = string.toCharArray();
        int numbers = 0;
        for (int i = 0; i < string.length(); i++){
            if(Character.isDigit(ch[i])){
                numbers++;
            }
        }
        return numbers;
    }
}