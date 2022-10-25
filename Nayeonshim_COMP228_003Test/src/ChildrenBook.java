public class ChildrenBook extends Book{
    private double price;
    public ChildrenBook(){

    }
    public ChildrenBook(String title, String ISBN, String publisher, double price, int year) {
        super(title, ISBN, publisher, price, year);
        this.price = price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getGenre() {
        return "Children";
    }
}
