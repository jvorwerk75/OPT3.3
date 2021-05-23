package sample;

public class ContractParttimer extends Contract {

    public ContractParttimer(Person person){
        super(person);
        makePartTimeContractCondition();

    }
    public String makeBeginText(){
        return "Hierbij bevestigen wij dat je met ingang van " + startDate + " je dienstverband zult voortzetten in de functie van " + function.getFunctionName() +  " op basis van een dienstverband voor onbepaalde tijd.\r\n";
    }
    public String makeTimeConditions(){
        return "Wij plaatsen jou per " + startDate + " op een lijst van personen met wie wij een soortgelijk contract hebben\r\n" +
                "afgesloten. We laten je op deze lijst staan totdat je aangeeft niet meer beschikbaar te zijn. Zolang je op deze\r\n" +
                "lijst staat kunnen wij je benaderen voor projecten. Als we je meerdere malen niet kunnen bereiken of we\r\n" +
                "ontvangen geen reactie dan zullen we je verwijderen van deze lijst.\r\n" +
                "De duur van de tot stand gekomen overeenkomst wordt bepaald door de duur van het project waar je op ingezet\r\n" +
                "wordt. Dat betekent dat de overeenkomst van rechtswege eindigt wanneer je inzet op het project afloopt. Dit\r\n" +
                "geldt zowel voor interne projecten als voor projecten bij of in opdracht van een van onze klanten. Waar mogelijk\r\n" +
                "zullen we je bij aanvang van het project en tijdens het project op de hoogte houden van wat je verwachten kunt.\r\n" +
                "Tussentijds kan de arbeidsovereenkomst voor bepaalde tijd worden beëindigd met inachtneming van de\r\n" +
                "wettelijke opzegtermijn van één maand.\r\n" +
                "Wij komen een proeftijd van één maand overeen, die aanvangt op de dag dat je de opgedragen werkzaamheden\r\n" +
                "daadwerkelijk uitvoert\r\n";
    }
}
