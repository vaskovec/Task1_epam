package by.bsu.mmf.task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vaskovec on 14.9.17.
 */
public class Subject {

    private String name;

    private Map<Student, Integer> marksMap;

    public Subject(String name) {

        marksMap = new HashMap<>();

        this.name = name;
    }

    public Subject(String name, Map<Student, Integer> marksMap) {
        this.name = name;
        this.marksMap = marksMap;
    }

    public Double avgMark() {

        return MarkManager.avgMark( marksMap.values());
    }


    public void addStudentWithMark(Student student, Integer mark) {

        marksMap.put(student, mark);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", marksMap=" + marksMap +
                '}';
    }
}
