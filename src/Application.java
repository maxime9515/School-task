import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random r = new Random();
        // String[] array  = new String[5]; {"Petya","Vladimir","Yulia","Valera","Sanya"};
        Student[] students = new Student[5];
        students[0] = new Student("sanya ", " belyy");
        students[1] = new Student("petya ", " porokh ");
        students[2] = new Student("sanya ", " usatiy ");
        students[3] = new Student("mister ", " devops ");
        students[4] = new Student("artem ", " frank ");


        int[] results = new int[5];
        for (int i = 0; i < students.length; i++) {
            results[i] = r.nextInt(5) + 1;
        }

        double average = 0;

        double sum = 0;
        for (int j = 0; j < results.length; j++) {
            sum += results[j];

        }
        average = sum / results.length;

        for (int n = 0; n < results.length; n++) {
            System.out.println(students[n].getName() + students[n].getLast_Name() + " Got a grade " + results[n]);

        }
        System.out.println("Average grade is: " + average);
    }
}
