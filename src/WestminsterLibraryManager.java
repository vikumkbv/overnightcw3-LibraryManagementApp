public class WestminsterLibraryManager implements LibraryManager {

    int libraryId;
    String libraryName;
    String location;

    public WestminsterLibraryManager(int libraryId, String libraryName, String location) {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.location = location;
    }

//    @Override
//    public void addItem();

    @Override
    public void addBook(String isbn, String title, String sector, DateTime publishDate, DateTime borrowedDate,
                        Reader currentReader, String itemType, Author author, Publisher publisher, int totalNumberofPages) {
        Book.storeBookDetails(new Book(isbn,title,sector,publishDate,borrowedDate,currentReader,itemType,author,publisher,
                totalNumberofPages));
    }

    @Override
    public void addDvd(String isbn, String title, String sector, DateTime publishDate, DateTime borrowedDate,
                       Reader currentReader, String itemType, String language, String subtitles, Creator producer, String actors) {
        Dvd.storedvdData(new Dvd(isbn,title,sector,publishDate,borrowedDate,currentReader,itemType,language,subtitles,producer,actors));
    }

    @Override
    public void deleteItem() {

    }

    @Override
    public void borrowItem() {

    }

    @Override
    public void returnItem() {

    }

    @Override
    public void listItem() {

    }

    @Override
    public void generateReport() {

    }

}
