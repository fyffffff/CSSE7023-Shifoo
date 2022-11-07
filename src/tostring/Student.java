package tostring;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    /** The student's name */
    private String name;
    /** Course codes which the student is enrolled in */
    private ArrayList<String> courses;

    /** Creates a new student with the given name.
     * @name the student's name
     */
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<String>();
    }

    /** Enrol in a course.
     * @param course course code of the course being enrolled in. e.g. CSSE2002
     */
    public void addCourse(String course) {
        this.courses.add(course);
    }

    /**
     * Returns the human-readable string representation of this student.
     * The format of the string to return is
     * "'name': courses='courseCodes'" without the single quotes,
     * where 'name' is this student's name and 'courseCodes' is a comma-separated
     * list of this student's enrolled courses.
     * For example, if the student is enrolled several courses:
     * "John Smith: courses=CSSE2002,DECO3801".
     * If the student is enrolled in one course: "John Smith: courses=CSSE2002".
     * If the student is not enrolled in any courses: "John Smith: courses=NO_COURSES".
     * @return string representation of this student
     */
    @Override
    public String toString() {
        StringBuilder outString = new StringBuilder(("%s: courses=").
                formatted(this.name));
        if (this.courses.size() == 0) {
            outString.append("NO_COURSES");
        } else {
            for (int i = 0; i < this.courses.size(); i++) {
                if (i != this.courses.size() - 1) {
                    outString.append(this.courses.get(i));
                    outString.append(",");
                } else {
                    outString.append(this.courses.get(i));
                }
            }
        }
        return outString.toString();
    }
}
