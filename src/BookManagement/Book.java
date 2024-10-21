package BookManagement;

public class Book {
    private String name;
    private float price;
    private int yearOfPublication;
    private Author author;

    public void TheBookName(){
        System.out.println(this.getName());
    }

    public boolean CompareSameYearOrNot(Book book){
//        if (this.date == book.date){
//            return true;
//        }else {
//            return false;
//        }

        return this.yearOfPublication == book.yearOfPublication;
    }

    public double Discount(double x){
        return this.price * (1 - x / 100);
    }


    public Book(String name, float price, int yearOfPublication, Author author) {
        this.name = name;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public Book(){}

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
