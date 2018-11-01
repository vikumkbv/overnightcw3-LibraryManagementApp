import java.util.ArrayList;
import java.util.List;

public class Dvd extends LibraryItem {

    private String language;
    private String subtitles;
    private Creator producer;
    private String actors;

    static List<Dvd> DvdData = new ArrayList<>();

    public Dvd(String isbn, String title, String sector, DateTime publishDate, DateTime borrowedDate, Reader currentReader,
               String itemType, String language, String subtitles, Creator producer, String actors) {
        super(isbn, title, sector, publishDate, borrowedDate, currentReader, itemType);
        this.language = language;
        this.subtitles = subtitles;
        this.producer = producer;
        this.actors = actors;
    }

    public static int getDvdcount(){
        return DvdData.size();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(String subtitles) {
        this.subtitles = subtitles;
    }

    public Creator getProducer() {
        return producer;
    }

    public void setProducer(Creator producer) {
        this.producer = producer;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

//methods related to DVD
    //to store dvd data

    public static void storedvdData(Dvd obj){

        if(DvdData.size()<50){
            DvdData.add(obj);
        }else{
            System.out.println("NO space to store more DVDs");
        }
    }

    @Override
    public String toString() {

        return  "Dvd : "  +
                "\n Type           = " + itemType +
                "\n Title          = " + title +
                "\n ISBN           = " + isbn  +
                "\n Language       = " + language  +
                "\n Subtitles      = " + subtitles  +
                "\n Producer       = " + producer  +
                "\n Actors         = " + actors  +
                "\n Sector         = " + sector +
                "\n Publish Date   = " + publishDate +
                "\n Borrowed Date  = " + borrowedDate +
                "\n Current Reader = " + currentReader +"\n \n";
    }
}
