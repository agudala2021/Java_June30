package Assignment_test;

public class Emp_Details {
    @Override
    public String toString() {
        return "Emp_Details{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emp_no='" + emp_no + '\'' +
                ", salary=" + salary +
                ", homeAddress='" + homeAddress + '\'' +
                ", company='" + company + '\'' +
                ", state='" + state + '\'' +
                ", skill='" + skill + '\'' +
                ", vaccine_status='" + vaccine_status + '\'' +
                '}';
    }

    private String firstName;
    private String lastName;
    private String emp_no;
    private int salary;
    private String homeAddress;
    private String company;
    private String state;
    private String skill;
    private String vaccine_status;

public Emp_Details(String firstName, String lastName, String emp_no, int salary, String homeAddress, String company, String state, String skill,String vaccine_status){
    this.firstName= firstName;
    this.lastName= lastName;
    this.emp_no = emp_no;
    this.salary= salary;
    this.homeAddress= homeAddress;
    this.company= company;
    this.state= state;
    this.skill  = skill;
    this.vaccine_status = vaccine_status;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() { return salary; }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getHomeAddress() {
        return homeAddress;
    }
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getEmp_no() {
        return emp_no;
    }
    public void setEmp_no(String emp_no) {
        this.emp_no = emp_no;
    }

    public String getVaccine_status() {
        return vaccine_status;
    }
    public void setVaccine_status(String vaccine_status) {
        this.vaccine_status = vaccine_status;
    }

}
