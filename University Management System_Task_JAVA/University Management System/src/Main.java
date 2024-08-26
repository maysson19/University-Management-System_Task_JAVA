public class Main {
    public static void main(String[] args) {
        // Create instances of Student, Professor, and Staff
        Student student1 = new Student(1, "Said Shabaan", "saidshabban@gmail.com", "StId12", new String[] {"Math", "Physics"});
        Professor professor1 = new Professor(2, "Shabaan Khalifa", "shabaankhalifa@gmail.com", "Prof330", "Computer Science", new String[] {"Programming", "CyberSecurity"});
        Staff staff1 = new Staff(3, "Mayson Said", "maysonsaidshaban@gamil.com", "Staf330", "Admin");

        // Create instances of ProgrammingCourse
        ProgrammingCourse course1 = new ProgrammingCourse("language Programming", "Cs50");
        ProgrammingCourse course2 = new ProgrammingCourse("Network","Cs50");

        // Assign professor and enroll students
        course1.assignProfessor(professor1);
        course1.enrollStudent(student1);
        course2.assignProfessor(professor1);
        course2.enrollStudent(student1);

        // Create a department and add courses and users
        Department department = new Department("Eng Computer Science");
        department.addCourse(course1);
        department.addCourse(course2);
        department.addUser(student1);
        department.addUser(professor1);
        department.addUser(staff1);

        // Create a university and add department
        University university = new University("Ain shams");
        university.addDepartment(department);

        // Display all information
        university.displayUniversityDetails();
    }
}
