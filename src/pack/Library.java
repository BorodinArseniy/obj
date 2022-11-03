package pack;

public class Library {

    private Book[] books;

    public static void main(String[] args) {

        Author author = new Author("Stephen", "King");
        Author author2 = new Author("Stephen", "King");
        System.out.println(author.equals(author2));

        Book book1 = new Book("IT", author, 1980);
        Book book2 = new Book("name", author, 1981);

        Library library = new Library();
        library.books[0] = book1;
        library.books[1] = book2;

        library.setYear("IT", 1979);
        library.printBookInfo("IT");

    }

    public Library() {
        this.books = new Book[7];
    }

    public void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                break;
            }
            System.out.printf("%s: %s: %d\n", books[i].getAuthor(), books[i].getName(), books[i].getYear());

        }
    }

    public void addBook(Book book, Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                books[i] = book;
                break;
            }

        }
    }

    public void printBookInfo(String str){
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i]!=null && this.books[i].getName()==str) {
                System.out.println(str + " by " + this.books[i].getAuthor() + " was published in " + this.books[i].getYear());
            }
        }
    }

    public void setYear(String str, int newDate) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i]!=null && this.books[i].getName()==str) {
                this.books[i].setYear(newDate);
            }
        }
    }


}
