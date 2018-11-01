public class Creator extends Person {

    int creatorId;

    public Creator(String fname, String lname, int age, int creatorId) {
        super(fname, lname, age);
        this.creatorId = creatorId;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    @Override
    public String toString() {
        return "Creator{" +
                "creatorId=" + creatorId +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}
