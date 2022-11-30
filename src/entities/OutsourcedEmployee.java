package entities;

public class OutsourcedEmployee extends Employee {
     
    private Double additionalCharge; 

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double addicionalCharge) {
        this.additionalCharge = addicionalCharge;
    }


    @Override
    public Double payment() {
        return super.payment() + additionalCharge * 1.1;
    } 
}
