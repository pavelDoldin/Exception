package sem_2;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        String patch = "C:\\Users\\Pavel\\IdeaProjects\\Exception\\src\\sem_2\\names.txt";
        List<String[]> list = readFile(patch);
        modificationArray(list);
        writeFile(list, patch);

    }

    /*
    Запишите в файл следующие строки:
    Анна=4
    Елена=5
    Марина=6
    Владимир=?
    Константин=?
    Иван=4
    Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив. В отдельном методе нужно
    будет пройти по структуре данных, если сохранено значение ?, заменить его на соответствующее число.
    Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее исключение.
    Записать в тот же файл данные с замененными символами ?.
     */
    public static List<String[]> readFile(String patch){

        List<String[]> listNames = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(patch));

            String line = "";
            while ((line = reader.readLine()) != null){
                listNames.add(line.split("="));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return listNames;
    }

    public static void modificationArray(List<String[]> listNames){
        for (String[] item : listNames) {
            if (!item[1].equals("?") && !checkNumber(item[1])) {
                throw new IllegalArgumentException("элемент не ? и не число");
            }
            if (item[1].equals("?")){
                item[1] = String.valueOf(item[0].length());
            }
        }
    }

    public static boolean checkNumber ( String value ) {
        try {
            Integer.parseInt(value);
            return true;
        } catch ( NumberFormatException e ) {
            return false;
        }
    }

    public static void writeFile(List<String[]> listNames, String patch){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(patch));
            for (String[] item : listNames){
                writer.write(item[0] + "=" + item[1] + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}




















