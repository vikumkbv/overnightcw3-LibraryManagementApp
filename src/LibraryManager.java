public interface LibraryManager {

//    void addItem();

    void addBook(String isbn, String title, String sector, DateTime publishDate, DateTime borrowedDate, Reader currentReader,
                 String itemType, Author author, Publisher publisher, int totalNumberofPages);

    void addDvd(String isbn, String title, String sector, DateTime publishDate, DateTime borrowedDate, Reader currentReader,
                String itemType, String language, String subtitles, Creator producer, String actors);

    void deleteItem();

    void listItem();

    void borrowItem();

    void returnItem();

    void generateReport();

}
