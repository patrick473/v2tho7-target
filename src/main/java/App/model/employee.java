package App.model;

public class employee {
    private Integer _employeeNumber;
    private String _firstName;
    private String _lastName;
    private String _ssn;
    private String _birthDate;
    private String _address;
    private String _city;
    private String _country;
    private String _email;
    private String _sex;
    private String _jobTitle;
    private String _department;

    public employee(Integer employeeNumber, String firstName, String lastName, String ssn, String birthDate,
            String address, String city, String country, String email, String sex, String jobTitle, String department) {
        this._employeeNumber = employeeNumber;
        this._firstName = firstName;
        this._lastName = lastName;
        this._ssn = ssn;
        this._birthDate = birthDate;
        this._address = address;
        this._city = city;
        this._country = country;
        this._email = email;
        this._sex = sex;
        this._jobTitle = jobTitle;
        this._department = department;
    }

    public Integer get_employeenumber() {
        return this._employeeNumber;
    }

    public void set_employeenumber(Integer _employeeNumber) {
        this._employeeNumber = _employeeNumber;
    }

    public String get_firstname() {
        return this._firstName;
    }

    public void set_firstname(String _firstName) {
        this._firstName = _firstName;
    }

    public String get_lastname() {
        return this._lastName;
    }

    public void set_lastname(String _lastName) {
        this._lastName = _lastName;
    }

    public String get_ssn() {
        return this._ssn;
    }

    public void set_ssn(String _ssn) {
        this._ssn = _ssn;
    }

    public String get_birthdate() {
        return this._birthDate;
    }

    public void set_birthdate(String _birthDate) {
        this._birthDate = _birthDate;
    }

    public String get_address() {
        return this._address;
    }

    public void set_address(String _address) {
        this._address = _address;
    }

    public String get_city() {
        return this._city;
    }

    public void set_city(String _city) {
        this._city = _city;
    }

    public String get_country() {
        return this._country;
    }

    public void set_country(String _country) {
        this._country = _country;
    }

    public String get_email() {
        return this._email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_sex() {
        return this._sex;
    }

    public void set_sex(String _sex) {
        this._sex = _sex;
    }

    public String get_jobtitle() {
        return this._jobTitle;
    }

    public void set_jobtitle(String _jobTitle) {
        this._jobTitle = _jobTitle;
    }

    public String get_department() {
        return this._department;
    }

    public void set_department(String _department) {
        this._department = _department;
    }

}