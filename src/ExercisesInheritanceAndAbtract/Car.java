package ExercisesInheritanceAndAbtract;

public class Car extends Vehicle{
    private String fuelType;

    public Car(Manufacturer manufacturer, String fuelType) {
        super("Car", manufacturer);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public double GetSpeed() {
        return 70;
    }
}
