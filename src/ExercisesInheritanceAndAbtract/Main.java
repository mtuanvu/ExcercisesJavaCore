package ExercisesInheritanceAndAbtract;

public class Main {
    public static void main(String[] args) {
        Plane vehicle1 = new Plane(new Manufacturer("VietJack", "VietNam"),
                "Air gas");
        Vehicle vehicle2 = new Car(new Manufacturer("Toyota", "Japan"),
                "Gasoline");
        Vehicle vehicle3 = new Bicycle(new Manufacturer("Giant", "Human"));


        System.out.println("Take the manufacturer's name: ");
        System.out.println(vehicle1.TakeProductionName());
        System.out.println(vehicle2.TakeProductionName());
        System.out.println(vehicle3.TakeProductionName());

        System.out.println("\nBoot media: ");
        vehicle1.Start();
        vehicle2.Start();
        vehicle3.Start();

        System.out.println("\nAcceleration means: ");
        vehicle1.SpeedUp();
        vehicle2.SpeedUp();
        vehicle3.SpeedUp();

        System.out.println("\nShutdown means: ");
        vehicle1.TurnOff();
        vehicle2.TurnOff();
        vehicle3.TurnOff();

        System.out.println("\nGet the speed of the vehicle: ");
        System.out.println(vehicle1.GetSpeed() + "km/h");
        System.out.println(vehicle2.GetSpeed() + "km/h");
        System.out.println(vehicle3.GetSpeed() + "km/h");

        System.out.print("\nPlane take off: ");
        vehicle1.TakeOff();

        System.out.print("\nPlane landing: ");
        vehicle1.Land();
    }
}
