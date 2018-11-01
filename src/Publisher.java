public class Publisher extends Person {

    int pubisherId;
    String company;

    public Publisher(int pubisherId, String company) {
        this.pubisherId = pubisherId;
        this.company = company;
    }

    public int getPubisherId() {
        return pubisherId;
    }

    public void setPubisherId(int pubisherId) {
        this.pubisherId = pubisherId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "pubisherId=" + pubisherId +
                ", company='" + company + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}
