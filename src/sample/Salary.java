package sample;

public class Salary {
    private String salarySort;
    private Double amount;

    public Salary(Boolean fulltime, Double amount){
        this.amount = amount;
        setLoonSoort(fulltime);
    }
    public Double getAmount(){return this.amount;}
    public String getSalarySort(){return this.salarySort;}

    //print volledige salaris regel.
    public String getFullSalary(){
        return amount.toString() + " " + salarySort;
    }

    //Verschil tussen een vaste medewerker en een parttimer
    public void setLoonSoort(Boolean fulltime){
        if(fulltime){
            this.salarySort = "per maand obv 40 uur per week";
        }else{
            this.salarySort = "Per uur";
        }
    }
}
