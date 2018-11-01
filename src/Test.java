import org.jcp.xml.dsig.internal.dom.DOMPGPData;

import java.nio.file.WatchEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void welcome(){
        System.out.println("__________________________________");
        System.out.println("     Welcome to library system    ");
        System.out.println("__________________________________");
    }
    // ******************* Main programme ****************
    public static void mainMenu(){

        /*//Readers information
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
        Publisher publisherDetails2 = new Publisher(100, "Gunasekara publication");*/


        welcome();
        System.out.println("__________________________________");
        System.out.println("Library Capacity         : " + (+Book.getBookCount() + Dvd.getDvdcount()) + "/150\n");
        System.out.println("Total Number of Books   : " + Book.getBookCount() + "/100");
        System.out.println("Total Number of DVDs    : " + Dvd.DvdData.size() + "/50" + "\n");
        System.out.println("Total Number of Readers : " + Reader.getNoofReaders());
        System.out.println("__________________________________\n");

        System.out.println("------------------------------------");
        System.out.println("Select menu item");
        System.out.println("------------------------------------");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. List Items");
        System.out.println("4. Borrow Items");
        System.out.println("5. Return Items");
        System.out.println("6. Generate Report");
        System.out.println("7. Exit");
        System.out.println("------------------------------------");
        System.out.print("Command: ");
        Scanner input = new Scanner(System.in);
        String command = input.next();
        System.out.println();
        switch (command) {
            case "1":
                //add things to add book info
                WestminsterLibraryManager.addItem();
                break;

            case "2":
                //add things to add dvd info
                WestminsterLibraryManager.deleteItem();
                break;

            case "3":
                //method to list items
                WestminsterLibraryManager.listItem();
                break;

            case "4":
                //method to borrow items
                WestminsterLibraryManager.borrowItem();
                break;

            case "5":
                WestminsterLibraryManager.returnItem();
                break;

            case "6":
                WestminsterLibraryManager.returnItem();
                break;

            case "7":
                System.out.println(".:: Programme Exist ::.");
                System.exit(1);
                break;

            default:
                System.out.println("Invalid Command, Try again");
                mainMenu();
                break;
        }
    }

    public static void main(String[] args) {

    // ******************* Main programme ****************
        mainMenu();
}
}
