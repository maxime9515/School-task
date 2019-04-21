public class Ticket {
    private int id;
    private String question;

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public Ticket(int id, String question) {
        this.question = question;
        this.id = id;
    }
}
