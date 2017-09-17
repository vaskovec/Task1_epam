package by.bsu.mmf.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vaskovec on 14.9.17.
 */
public class Group {

    private String name;
    private List<Student> students;
    private List<Integer> marks;


    public Group(String name) {

        this.name = name;

        students = new ArrayList<>();
        marks = new ArrayList<>();

    }

    public void addStudent(Student student) {

        students.add(student);
    }


    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }

    public double avgMark() {

        return MarkManager.avgMark(getMarks());

    }

    public List<Integer> getMarks() {

        this.marks = new ArrayList<>();

        for (Student student : students) {

            marks.addAll(student.getMarks());

        }

        return marks;
    }
}
