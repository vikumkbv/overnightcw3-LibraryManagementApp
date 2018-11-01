import java.util.ArrayList;
import java.util.List;

public abstract class LibraryItem {
    String isbn;
    String title;
    String sector;
    DateTime publishDate;
    DateTime borrowedDate;
    Reader currentReader;
    String itemType;
    private int itemCount;

    static List<LibraryItem> libraryItemsDetails= new ArrayList<>();

    //constructor to update Library item list
    /*LibraryItem(){

    }*/

    //overloaded constructor
    LibraryItem(String isbn, String title, String sector, DateTime publishDate, DateTime borrowedDate, Reader currentReader, String itemType) {
        this.isbn = isbn;
        this.title = title;
        this.sector = sector;
        this.publishDate = publishDate;
        this.borrowedDate = borrowedDate;
        this.currentReader = currentReader;
        this.itemType = itemType;
        itemCount++;
    }


    public int getItemcount(){
        return itemCount;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public DateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(DateTime publishDate) {
        this.publishDate = publishDate;
    }

    public DateTime getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(DateTime borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public Reader getCurrentReader() {
        return currentReader;
    }

    public void setCurrentReader(Reader currentReader) {
        this.currentReader = currentReader;
    }


    @Override
    public String toString() {
        return "LibraryItem{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", sector='" + sector + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", borrowedDate='" + borrowedDate + '\'' +
                ", currentReader='" + currentReader + '\'' +
                '}';
    }
}
