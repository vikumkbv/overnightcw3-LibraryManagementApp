import java.util.Scanner;

public class run {
    //Scanner for take Inputs
    public static Scanner input = new Scanner(System.in);
    public static WestminsterLibraryManager manager;

    // This method show the menu for manager and Return command Number
    public static int showMenu(){
        System.out.println("Add Item (1)");
        System.out.println("Delete Item (2)");
        System.out.println("Borrow Item (3)");
        System.out.println("Return Item (4)");
        System.out.println("List Items (5)");
        System.out.println("Generate Report (6) ");

        //Get Input
        System.out.println();
        System.out.print("Enter the command Number: ");
        return input.nextInt();
    }

    //This method for select the type of new Items
    public static void addItem(){
        System.out.println();
        System.out.println("Book (1)");
        System.out.println("DVD (2)");
        System.out.println("Enter the Item Type: ");
        int type = input.nextInt();
        if(type==1) addBook();
        else if(type==2) addDvd();
        else { System.out.println("Input Not valied Try Again"); addItem();}
    }
    // This method for delete a item
    public static void deleteItem(){

    }

    //This method for borrow Item
    public static void borrowItem(){

    }

    //This method for return Ite,
    public static void returnItem(){

    }

    //This method for list Items
    public static void listItem(){

    }

    //This method for generate report
    public static void generateReport(){

    }

    public static void addBook(){
        System.out.print("Enter Isbn Number: ");
        String isbn = input.next();
        //Take all other Inputs and Call them in add books :/
        manager.addBook(isbn);
    }

    public static void addDvd(){
        System.out.println("Enter Isbn Number");
        String isbn = input.next();
        //Same as above :D
        manager.addDvd(isbn);
    }

    public static void main(String args[]){
        manager = new WestminsterLibraryManager(5,"Westminister","Sri Lanka");

        int command = showMenu();
        switch (command){
            case 1: addItem(); break;
            case 2: deleteItem(); break;
            case 3: borrowItem(); break;
            case 4: returnItem(); break;
            case 5: listItem(); break;
            case 6: generateReport(); break;
            default: showMenu();
        }
    }
}
