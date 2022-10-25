public class ScienceBook extends Book{
    private double price;
    public ScienceBook(){

    }
    public ScienceBook(String title, String ISBN, String publisher, double price, int year) {
        super(title, ISBN, publisher, price, year);
        this.price = price;
    }

    @Override
    public void setPrice(double price) {
        price -= (price *0.1);
        this.price = price;

    }

    @Override
    public String getGenre() {
        return "Science";
    }
}
