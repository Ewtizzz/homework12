import java.util.Objects;

public class Book {
    private String name;
    private Author Author;
    private int year;

    public Book(String name, Author Author, int year){
        this.name = name;
        this.Author = Author;
        this.year = year;
    }

    public Author getAuthor(){
        return this.Author;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }


    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && name.equals(book.name) && Author.equals(book.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Author, year);
    }

    @Override
    public String toString() {
        return name + " " + Author + " " + year;
    }
}
