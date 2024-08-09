package test.com.job;

public class JobVO {
    private String job_id;
    private String job_title;
    private double min_salary;
    private double max_salary;

    // Getters and Setters
    public String getJobId() {
        return job_id;
    }

    public void setJobId(String job_id) {
        this.job_id = job_id;
    }

    public String getJobTitle() {
        return job_title;
    }

    public void setJobTitle(String job_title) {
        this.job_title = job_title;
    }

    public double getMinSalary() {
        return min_salary;
    }

    public void setMinSalary(double min_salary) {
        this.min_salary = min_salary;
    }

    public double getMaxSalary() {
        return max_salary;
    }

    public void setMaxSalary(double max_salary) {
        this.max_salary = max_salary;
    }

    @Override
    public String toString() {
        return "JobVO{" +
                "job_id='" + job_id + '\'' +
                ", job_title='" + job_title + '\'' +
                ", min_salary=" + min_salary +
                ", max_salary=" + max_salary +
                '}';
    }
}
