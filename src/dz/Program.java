package dz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {

        dz();


    }

    static void dz() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите <Фамилия> <Имя> <Отчество> <датарождения> <номертелефона> <пол> через пробел");
        String enter = scanner.nextLine();
        String[] enterSplit = enter.split(" ");

        if (enterSplit.length != 6) {
            throw new Exception("Мало пробелов.");
        }

        String surName = enterSplit[0];
        String name = enterSplit[1];
        String patronymic = enterSplit[2];


        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date birthdate;


        try {
            birthdate = format.parse(enterSplit[3]);
        } catch (ParseException e) {
            throw new ParseException("Неверный формат даты рождения", e.getErrorOffset());
        }

        int telephone;
        try {
            telephone = Integer.parseInt(enterSplit[4]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Не верный формат ввода телефона");
        }


        String gender = enterSplit[5];

        if (!gender.equals("m") && !gender.equals("f")) {
            throw new RuntimeException("Не верно выброн пол");
        }

        String fileName = "C:\\Users\\Pavel\\IdeaProjects\\Exception\\src\\dz\\" + surName.toLowerCase() + ".txt";
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file, true)){
            fileWriter.write(String.format("%s %s %s %s %s %s", surName, name, patronymic,birthdate, telephone, gender));
            fileWriter.write("\n");
        } catch (IOException e ) {
            throw new FileSystemException("Ошибка с файлом");
        }

    }

}
















