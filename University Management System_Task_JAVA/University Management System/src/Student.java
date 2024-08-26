//subclass Student
class Student extends User {
    private String studentId;
    private String[] courses;

    public Student(int id, String name, String email, String studentId, String[] courses) {
        super(id, name, email);
        this.studentId = studentId;
        this.courses = courses;
    }

    @Override
    public void getDetails(){
        System.out.println("Details Student:: ");
        System.out.println("ID:: "+getId());
        System.out.println("Name:: "+getName());
        System.out.println("Email:: "+getEmail());
        System.out.println("Student ID:: "+studentId);
        System.out.println("Courses:: "+String.join(" , ",courses) );
    }
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}