public class Student {
    private String name;
    private String lastName;
    private int ticketId;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.ticketId = -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
}
