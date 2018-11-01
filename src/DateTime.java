public class DateTime {

    private int day;
    private int month;
    private int year;

    public DateTime(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public String getDate(){
        return "Day :- "+this.day+" Month :- "+this.month+" Year :- "+this.year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

}
