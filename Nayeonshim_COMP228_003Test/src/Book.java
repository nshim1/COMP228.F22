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
    abstract public void setPrice(double price);
    abstract public String getGenre();

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Genre: " + getGenre()+'\n'+
                "Book title: " + title + "\n" +
                "ISBN: " + ISBN + '\n' +
                "publisher: " + publisher + '\n' +
                "price: " + price + '\n'+
                "year: " + year;
    }
}
