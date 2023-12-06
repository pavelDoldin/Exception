package sem_1;

public class Task_3 {

    /*
    Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
    Необходимо посчитать и вернуть сумму элементов этого массива.
    При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
    (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
    Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
     */

    public int sumElement ( int[][] ints ){
        int sum = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints.length != ints[i].length){
                throw new RuntimeException("Массив не кводратный, а " + ints.length + "*" + ints[i].length);
            }
            for (int j = 0; j < ints[i].length; j++) {
                if (ints[i][j] != 0 && ints[i][j] != 1){
                    throw new RuntimeException("Элемкнт не равет 0 или 1");
                }
                sum += ints[i][j];
            }
        }
        return sum;
    }

}
