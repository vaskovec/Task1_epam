package by.bsu.mmf.task1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vaskovec on 14.9.17.
 */
public class Student {

    private String name;
    private Map<Subject, Integer> marksMap;

    public Student(String name) {

        marksMap = new HashMap<>();
        this.name = name;
    }

    public Student(String name, Map<Subject, Integer> marks) {

        this.name = name;
        this.marksMap = marks;
    }

    public Double avgMark() {

        return MarkManager.avgMark( marksMap.values());
    }

    private void printMarks() {

        for (Map.Entry<Subject, Integer> subjectIntegerEntry : marksMap.entrySet()) {
            System.out.println(subjectIntegerEntry.getKey() +" " + subjectIntegerEntry.getValue());
        }
    }

    public void addSubject(Subject subject, Integer mark) {

        marksMap.put(subject,mark);

        subject.addStudentWithMark(this,mark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marksMap.values() +
                '}';
    }

    public Collection<Integer> getMarks() {
        return marksMap.values();
    }
}
