package pack;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Steven", "King");
        Book book1 = new Book("It", author, 1980);
        Book book2 = new Book("My New Book", author, 1981);
        book2.setYear(1982);
        System.out.println(book2.getYear());


    }
}
