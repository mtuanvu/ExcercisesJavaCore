package MovieManagement;

public class Movie {
    private String nameMovie;
    private int yearOfPublication;
    private Manufacturer manufacturer;
    private float price;
    private Date date;


    public boolean CheckMoviePrice(Movie movie){
        return this.price < movie.getPrice();
    }

    public String TheManufacturerName(){
        return this.manufacturer.getName();
    }

    public double PriceAfterPromotion(double x){
        return this.price * (1 - x / 100);
    }


    public Movie(String nameMovie, int yearOfPublication, Manufacturer manufacturer, float price, Date date) {
        this.nameMovie = nameMovie;
        this.yearOfPublication = yearOfPublication;
        this.manufacturer = manufacturer;
        this.price = price;
        this.date = date;
    }

    public Movie() {
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
