//subclass Staff
class Staff extends User {
    private String staffId;
    private String role;

    public Staff(int id, String name, String email, String staffId, String role) {
        super(id, name, email);
        this.staffId = staffId;
        this.role = role;
    }

    @Override
    public void getDetails() {
        System.out.println("Staff Details:");
        System.out.println("ID:: " + getId());
        System.out.println("Name:: " + getName());
        System.out.println("Email:: " + getEmail());
        System.out.println("Staff ID:: " + staffId);
        System.out.println("Role:: " + role);
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}