package sem_3.task_2;

import java.io.IOException;

public class Counter implements AutoCloseable {

    private Integer count = 0;

    public void add() throws IOException {
        checkClose();
        count ++;
    }

    public Integer getCount() throws IOException {
        checkClose();
        return count;
    }

    public void checkClose() throws IOException {
        if ( count == null ) {
            throw new IOException("Экземпляр закрыт");
        }
    }

    @Override
    public void close() {
        System.out.println("Метод close");
         count = null;
    }
}
