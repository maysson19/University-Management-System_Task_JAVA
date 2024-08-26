//// Class Department
class Department {
    private String name;
    private Course[] courses;
    private User[] users;

    public Department(String name) {
        this.name = name;
        this.courses = new Course[0];
        this.users = new User[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public void addCourse(Course course) {
        Course[] newCourses = new Course[courses.length + 1];
        System.arraycopy(courses, 0, newCourses, 0, courses.length);
        newCourses[courses.length] = course;
        setCourses(newCourses);
    }

    public void addUser(User user) {
        User[] newUsers = new User[users.length + 1];
        System.arraycopy(users, 0, newUsers, 0, users.length);
        newUsers[users.length] = user;
        setUsers(newUsers);
    }

    public void displayDepartmentDetails() {
        System.out.println("Department Details:: ");
        System.out.println("Name:: " + getName());
        System.out.println("Courses:: ");
        for (Course course : getCourses()) {
            course.getCourseDetails();
        }
        System.out.println("Users:: ");
        for (User user : getUsers()) {
            user.getDetails();
        }
    }
}
