package BookManagement;


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Dragon Ball 7", 5, 1999,
                new Author("Mai Tuan Vu", new Date(14, 01, 2005)));


        Book book2 = new Book("Naruto", 2, 2000,
                new Author("Pham Van Chinh", new Date(01, 01, 1998)));


        Book book3 = new Book("One Piece", 4, 1992,
                new Author("Duong Thai Hung", new Date(14, 01, 2005)));


        Book book4 = new Book("One Punch Man", 3, 2000,
                new Author("Hua Van Ngoc", new Date(01, 01, 1998)));

        book1.TheBookName();
        book2.TheBookName();
        book3.TheBookName();
        book4.TheBookName();

        System.out.println("\nCompare Book1 and Book2: " + book1.CompareSameYearOrNot(book2));

        System.out.println("\nBook 1 Discount 10% : " + book1.Discount(10));
    }
}
