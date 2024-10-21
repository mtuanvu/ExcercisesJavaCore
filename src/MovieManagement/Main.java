package MovieManagement;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Dragon Ball Daimani", 2024,
                new Manufacturer("OdaTV", "Japan"), 20,
                new Date(21, 10, 2024));

        Movie movie2 = new Movie("Bleach", 2024,
                new Manufacturer("TuanVuTV", "VietNam"), 25,
                new Date(10, 9, 2024));

        Movie movie3 = new Movie("One Piece", 2024,
                new Manufacturer("AkarataJr", "Japan"), 20,
                new Date(9, 12, 2024));

        Movie movie4 = new Movie("Doraemon", 2024,
                new Manufacturer("MCKTV", "Japan"), 20,
                new Date(21, 10, 2024));

        System.out.println("Movie 1 and Movie 2: " + movie2.CheckMoviePrice(movie1));

        System.out.println("Manufacturer: " + movie1.TheManufacturerName());

        System.out.println("Movie 1 after discount: " + movie1.PriceAfterPromotion(10));
    }
}
