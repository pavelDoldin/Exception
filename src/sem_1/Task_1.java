package sem_1;

public class Task_1 {

    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 5};
        System.out.println(getSize(ints, 5));
    }
           /*
          Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
          Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
          в качестве кода ошибки, иначе - длину массива.
           */

    static int getSize(int[] ints, int minLength){
        if (ints.length < minLength){
            return -1;
        }
        return ints.length;
    }

}
