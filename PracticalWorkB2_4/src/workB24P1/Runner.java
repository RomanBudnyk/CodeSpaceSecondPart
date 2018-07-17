package workB24P1;

import java.util.Scanner;

public class Runner {

    private Book[] books = {
            new Book(1, "Анна Каренина", "Лев Толстой", "Киев", 2000, 222, 45.53),
            new Book(2, "Автостопом по галактике", "Дуглас Адамс", "Киев", 2000, 451, 98.21),
            new Book(3, "Алиса в Стране чудес", "Льюис Кэрролл", "Львов", 1955, 985, 100.55),
            new Book(4, "Алхимик", "Пауло Коэльо", "Киев", 2001, 251, 200.75),
            new Book(5, "Ветер в ивах", "Кеннет Грэм", "Харьков", 1995, 200, 144.5),
            new Book(6, "Война и мир", "Лев Толстой", "Одесса", 1997, 1544, 547.40),
            new Book(7, "Громобой", "Энтони Хоровитц", "Днепр", 1988, 147, 665.55)
    };

    /*public Book[] createBooks(int size) {
        Book[] books1 = new Book[size];
        for (int i = 0; i < books1.length; i++) {
            books1 [i] = new Book(i + 1, "Title" + i, "Author" + 1, "Publish" + 1, 1900 + (int) (Math.random() * 100), 200 + (int) (Math.random() * 100), Math.random() * 200);
        }
        return books1;
    }*/

    void printArray() {
        for (Book booksArray : books) {
            //booksArray.view();
            System.out.printf("%-100s%n", booksArray.getID() + " | " + booksArray.getTitle() +
                    " | " + booksArray.getAuthor() + " | " + booksArray.getPublish() + " | " + booksArray.getYear() +
                    " | " + booksArray.getCountPage() + " | " + booksArray.getPrice());
        }
    }

    void changePrice() {
        System.out.println("---------------");
        while (true) {
            System.out.print("Enter percentage: ");
            Scanner scanner = new Scanner(System.in);
            String perc = scanner.nextLine();
            if (perc.matches("^[\\d.]+$")) {
                double percDouble = Double.parseDouble(perc);
                for (Book book : books) {
                    double a = book.getPrice();
                    book.setPrice(a - a * percDouble / 100);
                }
                break;
            } else {
                System.out.println("Wrong input!");
            }
        }
    }

    void printBookPrice() {
        for (Book booksArray : books) {
            System.out.printf("%s%n", booksArray.getID() + " | " + booksArray.getPrice());
        }
    }

    void run() {
        //printArray();
        changePrice();
        printBookPrice();
        getBooksOfTheExactAuthor();
        getBooksOfTheExactPublisher();
        getBooksOfTheExactYear();
    }

    void getBooksOfTheExactAuthor() {
        final Book[] books = this.books;
        System.out.println("-------------------");
        System.out.print("Enter author's name: ");
        Scanner scanner = new Scanner(System.in);
        String author = scanner.nextLine();
        boolean check = false;
        for (Book book : books) {
            if (author.equals(book.getAuthor())) {
                check = true;
                System.out.println(book.getID());
            }
        }
        if (!check) {
            System.out.println("There are no books from this author.");
        }
    }

    void getBooksOfTheExactPublisher() {
        final Book[] books = this.books;
        System.out.println("-------------------");
        System.out.print("Enter publisher's name: ");
        Scanner scanner = new Scanner(System.in);
        String publisher = scanner.nextLine();
        boolean check = false;
        for (Book book : books) {
            if (publisher.equals(book.getPublish())) {
                System.out.println(book.getID());
            }
        }
        if (!check) {
            System.out.println("There are no books from this publisher.");
        }
    }

    void getBooksOfTheExactYear() {
        final Book[] books = this.books;
        System.out.println("-------------------");
        boolean check = false;
        /*try {
            Scanner scanner = new Scanner(System.in);
            int year = scanner.nextInt();
            for (Book book : books) {
                if (year == book.getYear()) {
                    System.out.println(book.getID());
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong year.");
        }*/
        while (true) {
            System.out.print("Enter the year: ");
            Scanner scanner = new Scanner(System.in);
            String year = scanner.nextLine();
            if (year.matches("[0-9]+")) {
                int yearInt = Integer.parseInt(year);
                for (Book book : books) {
                    if (yearInt == book.getYear()) {
                        System.out.println(book.getID());
                    }
                }
                break;
            } else {
                System.out.println("Wrong input!");
            }
        }
        if (!check) {
            System.out.println("This year is not present in the book collection.");
        }
    }
}