public class ChildrenBook extends Book{
    public ChildrenBook(){

    }
    public ChildrenBook(String title, String ISBN, String publisher, double price, int year) {
        super(title, ISBN, publisher, price, year);
        setPrice(getPrice());

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
