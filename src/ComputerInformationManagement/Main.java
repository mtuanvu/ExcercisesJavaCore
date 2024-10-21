package ComputerInformationManagement;

public class Main {
    public static void main(String[] args) {
        InformationComputer computer1 = new InformationComputer(new Manufacturer("Asus",
                new Nation(10000000, "VietNam")),
                new Date(15, 01, 2023),
                240, 3);

        InformationComputer computer2 = new InformationComputer(new Manufacturer("Lenovo",
                new Nation(10000000, "China")),
                new Date(15, 01, 2023),
                250, 3);

        InformationComputer computer3 = new InformationComputer(new Manufacturer("MacBook",
                new Nation(10000000, "Japan")),
                new Date(15, 01, 2023),
                230, 3);

        InformationComputer computer4 = new InformationComputer(new Manufacturer("Dell",
                new Nation(10000000, "America")),
                new Date(15, 01, 2023),
                200, 3);

        System.out.println("\nThe price of computer 1 compared to computer 2 is: " + computer1.CheckComputerPrice(computer2));
        computer1.ManufacturingCountryName();

        System.out.println("\nThe price of computer 2 compared to computer 3 is: " + computer2.CheckComputerPrice(computer3));
        computer2.ManufacturingCountryName();

        System.out.println("\nThe price of computer 3 compared to computer 4 is: " + computer3.CheckComputerPrice(computer4));
        computer3.ManufacturingCountryName();

        System.out.println("\nThe price of computer 4 compared to computer 1 is: " + computer4.CheckComputerPrice(computer1));
        computer4.ManufacturingCountryName();
    }
}
