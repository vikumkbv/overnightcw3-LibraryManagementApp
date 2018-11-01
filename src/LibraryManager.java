public interface LibraryManager {

//methods for main functions in library
    static void addItem(){}
    static void deleteItem(){}
    static void listItem(){}
    static void borrowItem(){}
    static void returnItem(){}
    static void generateReport(){}

//methods to add books, dvd, publisher, dates, authors etc.
    void addBookInfo();
    void addDvdInfo();
    void addPublisher();
    void addAuther();
    void addCreator();
    void addReader();

}
