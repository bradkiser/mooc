import java.util.ArrayList;

public class Library{
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    } 
    
    public void printBooks() {
        for(Book i: this.books) {
            System.out.println(i);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> titles = new ArrayList<Book>();

        for(Book i: this.books) {
            if(StringUtil.included(i.title(), title)) {
                titles.add(i);
            }
        } 
        return titles;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> publishers = new ArrayList<Book>();

        for(Book i: this.books) {
            if(StringUtil.included(i.publisher(), publisher)) {
                publishers.add(i);
            }
        } 
        return publishers;
    } 
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> years = new ArrayList<Book>();

        for (Book i: this.books) {
            if (i.year() == year) {
                years.add(i);
            }
        }
        return years;
    }
}