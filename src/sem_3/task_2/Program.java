package sem_3.task_2;

import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        try (Counter counter = new Counter()) {
            counter.add();
            counter.add();
            counter.add();
            System.out.println(counter.getCount());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
