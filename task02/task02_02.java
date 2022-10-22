package task02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class task02_02 {
    public static void WriteFile(List<Dictionary<String, String>> students) {
        try {
            String pathProject = System.getProperty("user.dir");
            System.out.println(pathProject);
            String pathFile = pathProject.concat("/task02/task2.txt");
            FileWriter fw = new FileWriter(pathFile, StandardCharsets.UTF_8);
            fw.write(students.toString());
            fw.close();
        } catch (Exception exception) {
            System.out.println("Что-то пошло не так!");
        }
    }

    public static void ReadFile(List<Dictionary<String, String>> students) {
        try {
            String pathProject = System.getProperty("user.dir");
            System.out.println(pathProject);
            String pathFile = pathProject.concat("/task02/task2.txt");
            BufferedReader br = new BufferedReader(new FileReader(pathFile, StandardCharsets.UTF_8));
            String line = br.readLine();
            System.out.println(line);
            br.close();
        } catch (Exception exeption) {
            exeption.printStackTrace();
        }
    }

    public static void StringParse(List<Dictionary<String, String>> students) {
        StringBuilder sb = new StringBuilder();
        for (Dictionary<String, String> student : students) {
            sb.append("Студент ").append(student.get("фамилия")).append(" получил ").append(student.get("оценка"))
                    .append(" по предмету ").append(student.get("предмет")).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        // Дана json строка (сохранить в файл и читать из файла)
        // [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова",
        // "оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
        // Написать метод(ы), который распарсит json и, используя StringBuilder, создаст
        // строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

        // Пример вывода:
        // Студент Иванов получил 5 по предмету Математика.
        // Студент Петрова получил 4 по предмету Информатика.
        // Студент Краснов получил 5 по предмету Физика.
        Dictionary<String, String> student1 = new Hashtable<>();
        student1.put("фамилия", "Иванов");
        student1.put("оценка", "5");
        student1.put("предмет", "Математика");
        Dictionary<String, String> student2 = new Hashtable<>();
        student2.put("фамилия", "Петрова");
        student2.put("оценка", "4");
        student2.put("предмет", "Информатика");
        Dictionary<String, String> student3 = new Hashtable<>();
        student3.put("фамилия", "Краснов");
        student3.put("оценка", "5");
        student3.put("предмет", "Физика");
        List<Dictionary<String, String>> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        WriteFile(students);
        ReadFile(students);
        StringParse(students);

    }
}
