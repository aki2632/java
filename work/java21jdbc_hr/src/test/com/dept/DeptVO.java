package test.com.dept;

public class DeptVO {
    private int department_id;
    private String department_name;

    private int manager_id;
    private int location_id;

    // Getters and Setters
    public int getDepartmentId() {
        return department_id;
    }

    public void setDepartmentId(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartmentName() {
        return department_name;
    }

    public void setDepartmentName(String department_name) {
        this.department_name = department_name;
    }

    public int getManagerId() {
        return manager_id;
    }

    public void setManagerId(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getLocationId() {
        return location_id;
    }

    public void setLocationId(int location_id) {
        this.location_id = location_id;
    }

    @Override
    public String toString() {
        return "DeptVO{" +
                "department_id=" + department_id +
                ", department_name='" + department_name + '\'' +
                ", manager_id='" + manager_id + '\'' +
                ", location_id='" + location_id + '\'' +
                '}';
    }
}
