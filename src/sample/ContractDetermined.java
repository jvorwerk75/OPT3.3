package sample;

public class ContractDetermined extends Contract {
    private String endDate;

    public ContractDetermined(Person person){
        super(person);
        endDate();
        makeStandardContractConditions();

    }
    public void endDate(){
        System.out.println("Wat wordt de einddatum van het contract? (dd/mm/yy)");
        this.endDate = scanner.nextLine();

    }
    public String makeBeginText(){
        return  "Hierbij bevestigen wij dat je met ingang van " + startDate + " je dienstverband zult voortzetten in de functie van " +function.getFunctionName() +" op basis van een dienstverband voor bepaalde tijd.\r\n" +
                function.getFunctionExplained();

    }
    public String makeTimeConditions(){
        return "De overeenkomst wordt aangegaan per " + startDate + ". De eerste "+ probation +  " maand(en) van je arbeidsovereenkomst geldt als proeftijd. In de proeftijd mogen beide partijen de arbeidsovereenkomst per direct beëindigen. \r\n" +
                "De tijdelijke arbeidsovereenkomst eindigt van rechtswege op "+ endDate +  " zonder dat daarvoor enige opzegging of welke handeling dan ook vereist is.+\r\n" +
                "Tussentijds kan de arbeidsovereenkomst schriftelijk worden beëindigd met inachtneming van de wettelijke opzegtermijn. Het opzeggen van je arbeidsovereenkomst dient middels ondertekende brief te gebeuren.\r\n";

    }

}
