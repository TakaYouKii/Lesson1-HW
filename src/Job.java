public class Job {
    private String jobTitle;
    private String place;
    private String address;

    private int salary;

    public int getSalary() {
        return salary;
    }

    public Job(String place, String address) {
        this.place = place;
        this.address = address;

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getPlace() {
        return place;
    }

    public String getAddress() {
        return address;
    }

    public Job(String jobTitle, String place, String address, int salary) {
        this.jobTitle = jobTitle;
        this.place = place;
        this.address = address;
        this.salary = salary;
    }

}
