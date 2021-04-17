package WeeksClassActivity.Vehicle;

public class MotorCycle extends Vehicle{
    int noOfSeats;

    public MotorCycle(int vin, boolean isInsured, String brand, int noOfSeats) {
        super(vin, isInsured, brand);
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "noOfSeats=" + noOfSeats +
                ", vin=" + vin +
                ", isInsured=" + isInsured +
                ", brand='" + brand + '\'' +
                '}';
    }
}
