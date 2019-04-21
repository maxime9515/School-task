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
        Student[] students1 = new Student[5];
        students1[0] = new Student("sanya", " belyy");
        students1[1] = new Student("petya", " porokh ");
        students1[2] = new Student("sanya", " usatiy ");
        students1[3] = new Student("mister", " devops ");
        students1[4] = new Student("artem", " frank ");

        Student[] students2 = new Student[5];
        students2[0] = new Student("sanya", " belyy");
        students2[1] = new Student("petya", " porokh ");
        students2[2] = new Student("sanya", " usatiy ");
        students2[3] = new Student("mister", " devops ");
        students2[4] = new Student("artem", " frank ");

        Group[] groups = new Group[2];
        groups[0] = new Group("rap woyska", students1);
        groups[1] = new Group("optik russia", students2);

        processGroup(groups[0]);
        processGroup(groups[1]);
    }

    private static void processGroup(Group group) {
        Student[] students = group.getStudents();
        int[] results = new int[5];
        for (int i = 0; i < students.length; i++) {
            results[i] = RANDOM.nextInt(5) + 1;
        }

        // search for max result
        int max = results[0];
        int maxId = 0;
        for (int q = 1; q < results.length; ++q) {
            if (results[q] > max) {
                max = results[q];
                maxId = q;
            }
        }
        // search for min result
        int min = results[0];
        int minId = 0;
        for (int o = 1; o < results.length; ++o) {
            if (results[o] < min) {
                min = results[o];
                minId = o;
            }
        }

        double average = 0;

        double sum = 0;
        for (int result : results) {
            sum += result;

        }


        average = sum / results.length;

        for (Student student : students) {
            int p = RANDOM.nextInt(10) + 1;
            student.setTicketId(p);


        }


        for (int n = 0; n < results.length; n++) {
            int ticketId = students[n].getTicketId();
            String question = "";
            for (Ticket t : TICKETS) {
                if (t.getId() == ticketId) {
                    question = t.getQuestion();
                }
            }


            if (question.equals("")) {
                System.out.println("something went wrong, student " + students[n].getName() +
                        " " + students[n].getLastName() + " didn't receive a ticket");
            }
            System.out.println(students[n].getName() + " " + students[n].getLastName() + " Got a grade " +
                    results[n] + " and got ticket with " + question);

        }
        System.out.println("Average grade per group is: " + average);
        System.out.println("Maximum grade is " + max + ", student is " + students[maxId].getName() + " " + students[maxId].getLastName());
        System.out.println("Maximum grade is " + min + ", student is " + students[minId].getName() + " " + students[minId].getLastName());
    }


}
