package by.bsu.mmf.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vaskovec on 14.9.17.
 */
public class University {

    private static University university;

    private List<Faculty> faculties;
    private List<Subject> subjects;
    private List<Integer> marks;

    public static University getInstance() {

        if (university == null)
            university = new University();

        return university;
    }

    private University() {

        faculties = new ArrayList<>();
        subjects = new ArrayList<>();

        marks = new ArrayList<>();
        initDefaultFaculties();
    }

    private void initDefaultFaculties() {

        faculties.add(new Faculty("MMF"));
        faculties.add(new Faculty("GEO"));
        faculties.add(new Faculty("BIO"));
    }


    public void addFaculty(Faculty faculty) {

        faculties.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public Double avgMark() {



        for (Faculty faculty : faculties) {

            marks.addAll(faculty.getMarks());
        }

        return MarkManager.avgMark(marks);
    }


    public void addSubject(Subject subject) {

        subjects.add(subject);
    }
}
