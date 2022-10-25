public class ScienceBook extends Book{
    public ScienceBook(){

    }
    public ScienceBook(String title, String ISBN, String publisher, double price, int year) {
        super(title, ISBN, publisher, price, year);
       setPrice(getPrice());
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
