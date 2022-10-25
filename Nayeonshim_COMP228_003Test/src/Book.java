public abstract class Book {
    protected String title;
    protected String ISBN;
    protected String publisher;
    protected double price;
    protected int year;
    public Book(){

    }

    public Book(String title, String ISBN, String publisher, double price, int year) {
        this.title = title;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.price = price;
        this.year = year;
    }
    public abstract void setPrice(double price);
    public abstract String getGenre();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public double getPrice(){
        return price;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Genre: " + getGenre()+'\n'+
                "Book title: " + getTitle() + "\n" +
                "ISBN: " + getISBN() + '\n' +
                "publisher: " + getPublisher() + '\n' +
                "price: " + (getPrice()) + "$\n"+
                "year: " + getYear();
    }
}
