package uz.pdp.online.iostream;

import uz.pdp.online.model.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InpFR {


    public static List<Student> run() throws IOException {


        FileReader fileReader = new FileReader("resurs/student_grades.txt");
        BufferedReader bf=new BufferedReader(fileReader);

        List<Student> result=new ArrayList<>();

        String[] splittedData;
        int tempScore=0;

        String strLine;
        while ((strLine=bf.readLine())!=null)
        {
            splittedData=strLine.split(",");

            for (int i = 3; i < splittedData.length; i++) {
                tempScore += Integer.parseInt(splittedData[i]);
            }
            result.add(new Student(splittedData[0],splittedData[1],splittedData[2],tempScore,tempScore/2,85));

        }
        bf.close();

        return result;



    }
}
