// Class ProgrammingCourse
class ProgrammingCourse implements Course {
    private String courseName;
    private String courseCode;
    private Professor professor;
    private Student[] students;

    public ProgrammingCourse(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.students = new Student[0];
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public void getCourseDetails() {
        System.out.println("Course Details::");
        System.out.println("Course Name:: " + getCourseName());
        System.out.println("Course Code:: " + getCourseCode());
        if (getProfessor() != null) {
            System.out.println("Professor:: " + getProfessor().getName());
        }
        if (getStudents() != null) {
            System.out.print("Students:: ");
            for (Student student : getStudents()) {
                System.out.print(student.getName() + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void assignProfessor(Professor professor) {
        setProfessor(professor);
    }

    @Override
    public void enrollStudent(Student student) {
        Student[] newStudents = new Student[students.length + 1];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        newStudents[students.length] = student;
        setStudents(newStudents);
    }
}




