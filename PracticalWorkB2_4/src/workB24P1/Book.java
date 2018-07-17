package workB24P1;

public class Book {
    private int ID;
    private String title;
    private String author;
    private String publish;
    private int year;
    private int countPage;
    private double price;

    public Book() {
    }

    public Book(int ID, String title, String author, String publish, int year, int countPage, double price) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.publish = publish;
        this.year = year;
        this.countPage = countPage;
        this.price = price;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, String publish, int year, int countPage) {
        this.title = title;
        this.author = author;
        this.publish = publish;
        this.year = year;
        this.countPage = countPage;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book: " +
                "ID= " + ID +
                ", title= '" + title + '\'' +
                ", author= '" + author + '\'' +
                ", publish= '" + publish + '\'' +
                ", year= " + year +
                ", countPage= " + countPage +
                ", price= " + price +
                '}' + '\n';
    }

    public void view() {
        System.out.println("ID = " + ID);
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Publish = " + this.publish);
        System.out.println("Year = " + this.getYear());
        System.out.println("Count of Pages = " + countPage);
        System.out.println("Price = " + price);
    }
}