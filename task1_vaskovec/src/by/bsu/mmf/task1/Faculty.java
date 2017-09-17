package by.bsu.mmf.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vaskovec on 14.9.17.
 */
public class Faculty {

    private String name;
    private List<Group> groups;
    private List<Integer> marks;


    public Faculty(String name) {
        this.name = name;

        groups = new ArrayList<>();
        marks = new ArrayList<>();
    }

    public Faculty(String name, List<Group> groups) {
        this.name = name;
        this.groups = groups;
    }

    public List<Group> getGroups() {
        return groups;
    }


    public void addGroup(Group group) {
        groups.add(group);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", groups=" + groups +
                '}';
    }

    public Double avgMark() {

        return MarkManager.avgMark(getMarks());
    }


    public List<Integer> getMarks() {

        this.marks = new ArrayList<>();

        for (Group group : groups) {

            marks.addAll( group.getMarks() );
        }

        return marks;
    }
}
