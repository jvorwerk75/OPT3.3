package Contracts;
public class Forms{
    private Car car;
    private LBV lbv;
    public Forms() {
        makeForms();
    }
    public void makeForms(){
        this.car = new Car();
        this.lbv = new LBV();
    }
    public Car getCar(){return this.car;}
    public LBV getLbv(){return this.lbv;}
}
