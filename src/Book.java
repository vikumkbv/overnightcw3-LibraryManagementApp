import java.util.ArrayList;
import java.util.List;

public class Book extends LibraryItem {

    private Author author;
    private Publisher publisher;
    private int totalNumberofPages;

    static List<Book> bookDetails = new ArrayList<>();

//this constructor is used to pass data to
    public Book(String isbn, String title, String sector, DateTime publishDate, DateTime borrowedDate, Reader currentReader,
                String itemType, Author author, Publisher publisher, int totalNumberofPages) {
        super(isbn, title, sector, publishDate, borrowedDate, currentReader, itemType);
        this.author = author;
        this.publisher = publisher;
        this.totalNumberofPages = totalNumberofPages;
    }

    static int getBookCount(){
        return bookDetails.size();
    }

    public Author getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getTotalNumberofPages() {
        return totalNumberofPages;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setTotalNumberofPages(int totalNumberofPages) {
        this.totalNumberofPages = totalNumberofPages;
    }

//methods related to DVD
  //to store dvd data
    public static void storeBookDetails(Book obj){

        if(bookDetails.size()<100){
            bookDetails.add(obj);
        }else{
            System.out.println("NO space to store more Books");
        }
    }

    @Override
    public String toString() {
        return "Book : " +
                "\n Type                   = " + itemType +
                "\n Title                  = " + title +
                "\n ISBN                   = " + isbn +
                "\n Author                 = " + author +
                "\n Publisher              = " + publisher +
                "\n Total Number of Pages  = " + totalNumberofPages +
                "\n Sector                 = " + sector +
                "\n Publish Date           = " + publishDate  +
                "\n Borrowed Date          = " + borrowedDate  +
                "\n Current Reader         = " + currentReader +
                '\n'+'\n';
    }


}
