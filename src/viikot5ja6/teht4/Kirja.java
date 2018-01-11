package viikot5ja6.teht4;

public class Kirja {

    // === Properties === //
    private String bookName;
    private String isbn;
    private double price;
    private Kustantaja kustantaja;

    // === Constructors === //
    public Kirja() {
    }

    public Kirja(String bookName, String isbn, double price) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.price = price;
    }

    public Kirja(String bookName, String isbn, double price, Kustantaja kustantaja) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.price = price;
        this.kustantaja = kustantaja;
    }

    // === Getters / Setters === //
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Kustantaja getKustantaja() {
        return kustantaja;
    }

    public void setKustantaja(Kustantaja kustantaja) {
        this.kustantaja = kustantaja;
    }

    // === toString === //

    @Override
    public String toString() {
        return "Kirja{" +
                "bookName='" + bookName + '\'' +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                ", kustantaja=" + kustantaja +
                '}';
    }
}
