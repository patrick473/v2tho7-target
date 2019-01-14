package App.model;

public class employee {
    private Integer employeeNumber;
    private String firstName;
    private String lastName;
    private String ssn;
    private String birthDate;
    private String address;
    private String city;
    private String country;
    private String email;
    private String sex;
    private String jobTitle;
    private Integer department;

    public employee(Integer employeeNumber, String firstName, String lastName, String ssn, String birthDate,
            String address, String city, String country, String email, String sex, String jobTitle,
            Integer department) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.birthDate = birthDate;
        this.address = address;
        this.city = city;
        this.country = country;
        this.email = email;
        this.sex = sex;
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public employee() {
    }

    public Integer getEmployeenumber() {
        return this.employeeNumber;
    }

    public void setEmployeenumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstname() {
        return this.firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return this.lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return this.ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getBirthdate() {
        return this.birthDate;
    }

    public void setBirthdate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJobtitle() {
        return this.jobTitle;
    }

    public void setJobtitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Integer getDepartment() {
        return this.department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }
}