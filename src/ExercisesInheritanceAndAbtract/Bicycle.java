package ExercisesInheritanceAndAbtract;

public class Bicycle extends Vehicle{

    public Bicycle(Manufacturer manufacturer) {
        super("Bicycle", manufacturer);
    }


    @Override
    public double GetSpeed() {
       return 5;
    }
}
