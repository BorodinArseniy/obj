package pack;

public class Book {
    private String name;
    private Author author;
    private int year;


    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;

    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author.getName() + " " + author.getSurname();
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear2(){
        return getYear();
    }

    @Override
    public int hashCode() {return 1;}
    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        return name.equals(((Book) obj).name);

    }

    @Override
    public String toString() {
        return author.toString() + ": " + name + ", " + year;
    }


    public static void main(String[] args) {

    }


}
