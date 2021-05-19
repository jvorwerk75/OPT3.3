package sample;

public class ContractNotDetermined extends Contract {

    public ContractNotDetermined(Person person){
        super(person);
        makeStandardContractConditions();
    }
    public String makeBeginText(){
        return  "Hierbij bevestigen wij dat je met ingang van " + startDate + " je dienstverband zult voortzetten in de functie van " +function.getFunctionName() +" op basis van een dienstverband voor onbepaalde tijd.\r\n" +
                function.getFunctionExplained();

    }
    public String makeTimeConditions(){
        return "De overeenkomst wordt aangegaan per " + startDate + " voor onbepaalde tijd. \r\n" +
                "Tussentijds kan de arbeidsovereenkomst schriftelijk worden beëindigd met inachtneming van de wettelijke opzegtermijn. Het opzeggen van je arbeidsovereenkomst dient middels ondertekende brief te gebeuren.\r\n";
    }
}
