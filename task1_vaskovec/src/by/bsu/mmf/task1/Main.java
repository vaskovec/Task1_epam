package by.bsu.mmf.task1;

public class Main {

    private static int numberOfGroups = 3;

    private static int numberOfStudents = 3;

    private static int getNumberOfSubjects = 3;

    public static void main(String[] args) {

        University university = University.getInstance();

        initUniversity(university);

        //test

        for (Faculty faculty : university.getFaculties()) {
            System.out.println(faculty);
        }

        System.out.println("Средний балл по предмету");
        System.out.printf("avg mark %.1f \n", university.getSubjects().get(1).avgMark());
        System.out.println("Средний балл студента");
        System.out.printf("avg mark %.1f \n", university.getFaculties().get(0).getGroups().get(1).getStudents().get(2).avgMark());
        System.out.println("Средний балл группы");
        System.out.printf("avg mark %.1f \n", university.getFaculties().get(2).getGroups().get(1).avgMark());
        System.out.println("Средний балл факультета");
        System.out.printf("avg mark %.1f \n", university.getFaculties().get(1).avgMark());
        System.out.println("Средний балл университета");
        System.out.printf("avg mark %.1f \n", university.avgMark());

    }

    private static void initUniversity(University university) {

        for (Faculty faculty : university.getFaculties()) {

            for (int i = 0; i < numberOfGroups; i++) {

                faculty.addGroup(new Group(i+""));

                for (int j = 0; j < numberOfStudents; j++) {

                    Group group = faculty.getGroups().get(i);
                    group.addStudent(new Student(j+""));


                    for (int k = 0; k <getNumberOfSubjects ; k++) {

                        Student student = group.getStudents().get(j);

                        Subject subject = new Subject(k+"");
                        university.addSubject(subject);
                        student.addSubject(subject, Main.generateRandomMark() );
                    }
                }
            }
        }

    }

    public static Integer generateRandomMark() {

        return  Integer.parseInt( Math.round(Math.random() *10) +"" );
    }
}
