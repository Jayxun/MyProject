package uz.pdp.online;

import uz.pdp.online.iostream.InpFR;
import uz.pdp.online.iostream.OutGradeReport;
import uz.pdp.online.model.Student;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Student> students = InpFR.run();

        OutGradeReport.run(students);

        System.out.println("Programm worked succesfully");


    }


}
