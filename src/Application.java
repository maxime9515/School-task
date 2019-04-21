import java.util.Random;

public class Application {
    private static final Ticket[] TICKETS;
    private static final Random RANDOM = new Random();

    static {
        TICKETS = new Ticket[10];
        TICKETS[0] = new Ticket(1, "question1");
        TICKETS[1] = new Ticket(2, "question2");
        TICKETS[2] = new Ticket(3, "question3");
        TICKETS[3] = new Ticket(4, "question4");
        TICKETS[4] = new Ticket(5, "question5");
        TICKETS[5] = new Ticket(6, "question6");
        TICKETS[6] = new Ticket(7, "question7");
        TICKETS[7] = new Ticket(8, "question8");
        TICKETS[8] = new Ticket(9, "question9");
        TICKETS[9] = new Ticket(10, "question10");
    }

    public static void main(String[] args) {
        // Students array filling
        Student[] students = new Student[5];
        students[0] = new Student("sanya ", " belyy");
        students[1] = new Student("petya ", " porokh ");
        students[2] = new Student("sanya ", " usatiy ");
        students[3] = new Student("mister ", " devops ");
        students[4] = new Student("artem ", " frank ");

        int[] results = new int[5];
        for (int i = 0; i < students.length; i++) {
            results[i] = RANDOM.nextInt(5) + 1;
        }

        double average = 0;

        double sum = 0;
        for (int result : results) {
            sum += result;

        }
        average = sum / results.length;

        for (Student student : students) {
            int p = RANDOM.nextInt(10);
            student.setTicketId(p);


        }

        for (int n = 0; n < results.length; n++) {
            System.out.println(students[n].getName() + students[n].getLastName() + " Got a grade " + results[n] + " and got ticket with " + TICKETS[students[n].getTicketId()].getQuestion());

        }
        System.out.println("Average grade is: " + average);

    }


}
