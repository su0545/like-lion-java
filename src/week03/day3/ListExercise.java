package week03.day3;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise(){
  //      System.out.println(students);
        this.students = new ArrayList<>();
        this.students.add("전수진");
        this.students.add("김경록");
        this.students.add("김나나");
        this.students.add("박지민");
        this.students.add("연지우");



    }
    public List<String> getStudents(){
        return this.students;
    }
}
