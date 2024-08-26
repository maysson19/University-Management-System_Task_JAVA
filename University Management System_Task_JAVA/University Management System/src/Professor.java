//subclass Professor
class Professor extends User {
    private String professorId;
    private String department;
    private String[] coursesTaught;

    public Professor(int id, String name, String email, String professorId, String department, String[] coursesTaught) {
        super(id, name, email);
        this.professorId = professorId;
        this.department = department;
        this.coursesTaught = coursesTaught;
    }

    @Override
    public void getDetails() {
        System.out.println("Professor Details:");
        System.out.println("ID:: " + getId());
        System.out.println("Name:: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Email: " + getEmail());
        System.out.println("Email:: " + getEmail());
        System.out.println("Professor ID:: " + professorId);
        System.out.println("Department:: " + department);
        System.out.println("Courses Taught:: " + String.join(", ", coursesTaught) );
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
}

