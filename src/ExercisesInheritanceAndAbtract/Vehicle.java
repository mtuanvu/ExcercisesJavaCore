package ExercisesInheritanceAndAbtract;

public abstract class Vehicle {
    protected String vehicleType;
    protected Manufacturer manufacturer;

    public String TakeProductionName(){
        return "The name of the product is: " + manufacturer.getManufacturerName();
    }

    public void Start(){
        System.out.println("Vehicle Start");
    }

    public void SpeedUp(){
        System.out.println("Vehicle Get Speed Up");
    }

    public void TurnOff(){
        System.out.println("Vehicle Turn Off");
    }

    public abstract double GetSpeed();

    public Vehicle(String vehicleType, Manufacturer manufacturer) {
        this.vehicleType = vehicleType;
        this.manufacturer = manufacturer;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
