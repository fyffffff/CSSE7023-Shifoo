package substitutionbasic;

import java.util.ArrayList;

public class LiskovSubstitution {

    /**
     * Makes a new list of three students, including a Coursework student, a
     * ResearchStudent, and a ExchangeStudent, in this exact order.
     * Returns the resulting list of three students.
     * @return list of three different student types
     */
    public static ArrayList<Student> makeStudentList() {
        ArrayList<Student> stuList = new ArrayList<>();
        Student coursework = new CourseworkStudent();
        Student research = new ResearchStudent();
        Student exchange = new ExchangeStudent();
        stuList.add(coursework);
        stuList.add(research);
        stuList.add(exchange);
        return stuList;
    }
}
