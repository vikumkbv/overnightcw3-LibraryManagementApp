import java.util.Scanner;

public class WestminsterLibraryManager implements LibraryManager {

    int libraryId;
    String libraryName;
    String location;

    public WestminsterLibraryManager(int libraryId, String libraryName, String location) {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.location = location;
    }

//main menu handlers
    public static void addItem() {
        System.out.println("Select item Type");
        System.out.println("---------------------");
        System.out.println("1. Book");
        System.out.println("2. DVD");
        System.out.println("3. Main Menu");
        System.out.println("4. Exit");
        System.out.println("---------------------");
        System.out.print("Command: ");
        Scanner input = new Scanner(System.in);
        String command = input.next();
        System.out.println();

        Reader reader1 = new Reader(1, "Vikum", 773025658, "vikumkbv@gmail.com");
        Reader reader2 = new Reader(2,"Charith", 757803021, "charith@gmail.com");
        Reader reader3 = new Reader(3, "Sashika", 775689745, "sashikassn@gmail.com");
        Reader reader4 = new Reader(4,"Danushka", 773024562, "danuwa@gmail.com");
        //Add readers to list

        Reader.storeReaderDetails(reader1);
        Reader.storeReaderDetails(reader2);
        Reader.storeReaderDetails(reader3);
        Reader.storeReaderDetails(reader4);

        //Creator information
        Creator creator1 = new Creator("chamath", "asela", 24, 100);
        Creator creator2 = new Creator("sashika", "sandeepana", 24, 101);

        //Details needed for books
        DateTime book5publisherDate1 = new DateTime(12,5,2018);
        DateTime borroeDate1 = new DateTime(30, 6,2018);
        Author authorDetails1 = new Author("saman", "perera", 35, 1);
        Publisher publisherDetails1 = new Publisher(100, "sarasavi publication");

        DateTime book5publisherDate2 = new DateTime(12,5,2018);
        DateTime borrowDate2 = new DateTime(30, 6,2018);
        Author authorDetails2 = new Author("wilbert", "wickaramaarachi", 35, 4);
        Publisher publisherDetails2 = new Publisher(100, "Gunasekara publication");

        switch (command) {
            case "1":
                //add things to add book info


                Book book1 = new Book("ISBN175395","UML Design","IT", book5publisherDate1,
                        borroeDate1,reader1,"Book", authorDetails1, publisherDetails1, 650);
                Book book2 = new Book("ISBN175652","Accounting Basics","Accounting", book5publisherDate2,
                        borrowDate2,reader2,"Book", authorDetails2, publisherDetails2, 650);

                //Add book information to list
                Book.storeBookDetails(book1);
                Book.storeBookDetails(book2);
                System.out.println("Book data added successfully");
                addItem();
                break;

            case "2":
                //add things to add dvd info
                Dvd dvd1 = new Dvd("DVD45619", "Java Fundermentals", "IT",book5publisherDate1,
                        borroeDate1, reader1, "DVD", "English",
                        "Sinhala",creator1,"screen recording");

                Dvd dvd2 = new Dvd("DVD45719", "Web Fundermentals", "WEB",book5publisherDate1,
                        borroeDate1, reader1, "DVD", "English",
                        "Sinhala",creator1,"Screen + Video");

                //Add data to dvd array list
                Dvd.storedvdData(dvd1);
                Dvd.storedvdData(dvd2);
                System.out.println("DVD data added successfully");
                addItem();
                break;

            case "3":
                //add a method to go to main menu
                Test.mainMenu();
                break;

            case "4":
                System.out.println(".:: Programme Exist ::.");
                System.exit(1);
                break;

            default:
                System.out.println("Invalid Command, Try again");
                WestminsterLibraryManager.addItem();
                break;
        }

    }


    public static void deleteItem() {
        System.out.println("Book with ISBN  " +Book.bookDetails.get(0).isbn + " deleting");
        System.out.println("DVD with ISBN  " +Dvd.DvdData.get(0).isbn + " deleting");

        Book.bookDetails.remove(0);
        Dvd.DvdData.remove(0);

        System.out.println("1 book and 1 dvd removed");
        Test.mainMenu();


    }

    public static void borrowItem() {

        System.out.println("this is borrow menu");
        Test.mainMenu();
    }


    public static void returnItem() {

        System.out.println("this is return menu");
        Test.mainMenu();
    }


    public static void listItem() {

        System.out.println("   --- DVD INFORMATION ---     ");
        System.out.println("__________________________________\n");
        System.out.println(Dvd.DvdData.toString());

        System.out.println("\n__________________________________");
        System.out.println("   --- BOOK INFORMATION ---     ");
        System.out.println("__________________________________\n");
        System.out.println(Book.bookDetails.toString());

        System.out.println("\n__________________________________");
        System.out.println("   --- READERS INFORMATION ---    ");
        System.out.println("__________________________________\n");
        System.out.println(Reader.readerDetails.toString());

        Test.mainMenu();
    }

    public static void generateReport() {

        System.out.println("this is report generation");
        System.out.println("   --- DVD INFORMATION ---     ");
        System.out.println("__________________________________\n");
        System.out.println(Dvd.DvdData.toString());

        System.out.println("\n__________________________________");
        System.out.println("   --- BOOK INFORMATION ---     ");
        System.out.println("__________________________________\n");
        System.out.println(Book.bookDetails.toString());

        System.out.println("\n__________________________________");
        System.out.println("   --- READERS INFORMATION ---    ");
        System.out.println("__________________________________\n");
        System.out.println(Reader.readerDetails.toString());
        Test.mainMenu();
    }

//basic supporting functions


    @Override
    public void addBookInfo() {

    }

    @Override
    public void addDvdInfo() {

    }

    @Override
    public void addReader() {

    }

    @Override
    public void addAuther() {

    }

    @Override
    public void addCreator() {

    }

    @Override
    public void addPublisher() {

    }
}
