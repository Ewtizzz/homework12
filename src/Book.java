public class Book {
    private String name;
    private String Author;
    private int year;

    public Book(String name, String author, int year){
        this.name = name;
        this.Author = author;
        this.year = year;
    }

    public String getAuthor(){
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

}
