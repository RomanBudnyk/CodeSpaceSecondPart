package workB24P1;

public class TaskB21P1 {
    public static void main(String[] args) {
        Book book = new Book();
//      infoBook(book);
        book.view();

        book.setTitle("Title");
        book.setYear(2001);
        book.setPrice(324.3);
        System.out.println("-------------------");
//      infoBook(book);
        book.view();
        System.out.println("-------------------");

        //создать экземпляр и отобразить
        Book book1 = new Book(null, "Pushkin");
        book1.view();
        System.out.println("-------------------");
        Book book2 = new Book("Вечера на хуторе близь Диканьки", "Гоголь", "Киев", 1950, 200);
        book2.view();
        System.out.println("-------------------");
        Book book3 = new Book(null, null);
        book3.view();


        System.out.println("-------------------");
        Runner bookArr = new Runner();
        bookArr.printArray();

        System.out.println("-------------------");
        Runner bookArrForChangedPrice = new Runner();
        bookArrForChangedPrice.run();
        System.out.println("-------------------");

        //еще один способ вывода массива
        //System.out.println(bookArr.printArrayToString());
    }


//    public static void getInfoBook(Book book) {
//        System.out.println("ID = " + book.getID());
//        System.out.println("Title = " + book.getTitle());
//        System.out.println("Author = " + book.getAuthor());
//        System.out.println("Publish = " + book.getPublish());
//        System.out.println("Year = " + book.getYear());
//        System.out.println("Page = " + book.getCountPage());
//        System.out.println("Price = " + book.getPrice());
//    }
}
