import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Reader {

    private int id;
    private String name;
    private int mobileNumber;
    private String email;

    static List<Reader> readerDetails = new ArrayList<>();

    public Reader(int id, String name, int mobileNumber, String email) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;

    }

    static int getNoofReaders(){
        return readerDetails.size();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void storeReaderDetails(Reader obj){
        readerDetails.add(obj);
    }

    @Override
    public String toString() {
        return "Reader : " +
                "\n Id            = " + id +
                "\n Name          = " + name  +
                "\n Mobile Number = 0" + mobileNumber +
                "\n Email         = " + email +"\n \n";
    }
}
