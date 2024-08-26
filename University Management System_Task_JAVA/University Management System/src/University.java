class University {
    private String name;
    private Department[] departments;

    public University(String name) {
        this.name = name;
        this.departments = new Department[0];
    }

    public void addDepartment(Department department) {
        Department[] newDepartments = new Department[this.departments.length + 1];
        for (int i = 0; i < this.departments.length; i++) {
            newDepartments[i] = this.departments[i];
        }
        newDepartments[this.departments.length] = department;
        this.departments = newDepartments;
    }

    public void displayUniversityDetails() {
        System.out.println("University Name: " + name);
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }
}
