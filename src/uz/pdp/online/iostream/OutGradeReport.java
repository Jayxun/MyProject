package uz.pdp.online.iostream;

import uz.pdp.online.model.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutGradeReport {
    public static void run(List<Student> students) throws IOException {


        FileWriter fileWriter=new FileWriter("grade_reports.txt");
        BufferedWriter bw=new BufferedWriter(fileWriter);

        StringBuilder result = new StringBuilder();

        for (Student student : students) {
            result.append(student.toString()).append("\n\n");
        }

        bw.write(result.toString());
        bw.close();
    }
}
