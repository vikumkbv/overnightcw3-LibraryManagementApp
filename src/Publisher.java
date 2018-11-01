public class Publisher extends Person {

    int pubisherId;

    public Publisher(String fname, String lname, int age, int pubisherId) {
        super(fname, lname, age);
        this.pubisherId = pubisherId;
    }

    public int getPubisherId() {
        return pubisherId;
    }

    public void setPubisherId(int pubisherId) {
        this.pubisherId = pubisherId;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "pubisherId=" + pubisherId +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}
