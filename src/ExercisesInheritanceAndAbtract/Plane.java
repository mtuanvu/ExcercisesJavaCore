package ExercisesInheritanceAndAbtract;

public class Plane extends Vehicle {
    private String fuelType;


    public Plane(Manufacturer manufacturer, String fuelType) {
        super("Plane", manufacturer);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void TakeOff(){
        System.out.println("Plane Take off");
    }

    public void Land(){
        System.out.println("Plane Land");
    }

    @Override
    public double GetSpeed() {
        return 500;
    }
}
