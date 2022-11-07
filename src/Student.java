public class Student {
    /* Create any necessary variables here */
    private String name;
    private String address;
    private int postCode;
    private double gpa;

    /**
     * Initialises the class information including student name, postcode,
     * address and gpa.
     * @param name The student's name.
     * @param address The student's current residential address.
     * @param postCode The student's current residential postcode.
     * @param gpa The student's current gpa.
     */
    public Student(String name, String address, int postCode, double gpa) {
        this.name = name;
        this.address = address;
        this.postCode = postCode;
        this.gpa = gpa;
    }

    /**
     * Returns the student's name.
     * @return Student's name.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Returns the student's address.
     * @return Student's address.
     */
    public String getAddress() {
        return this.address;
    }
    /**
     * Returns the student's postcode.
     * @return Student's postcode.
     */
    public int getPostCode() {
        return this.postCode;
    }
    /**
     * Returns the student's gpa.
     * @return Student's gpa.
     */
    public double getGPA() {
        return this.gpa;
    }

    /**
     * Change the student's name.
     * @param name Student's new name.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Change the student's address.
     * @param address Student's new address.
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * Change the student's postcode.
     * @param postCode Student's new postcode.
     */
    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }
    /**
     * Change the student's gpa.
     * @param gpa Student's new gpa.
     */
    public void setGPA(double gpa) {
        this.gpa = gpa;
    }
}
