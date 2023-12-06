package sem_1;

public class Task_4 {

    public void checkNull(Integer[] array) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if ( array[i] == null ){
                result.append(i).append(" ");
            }
        }
        if (!result.isEmpty()){
            throw new RuntimeException("В списке есть null их индекс/ы " + result);
        }
    }

}
