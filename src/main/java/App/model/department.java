package App.model;

public class department {
    private Integer _departmentNumber;
    private String _name;
    private String _location;

    public department(Integer departmentNumber, String name, String location) {
        this._departmentNumber = departmentNumber;
        this._name = name;
        this._location = location;
    }

    public Integer get_departmentnumber() {
        return this._departmentNumber;
    }

    public void set_departmentnumber(Integer _departmentNumber) {
        this._departmentNumber = _departmentNumber;
    }

    public String get_name() {
        return this._name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_location() {
        return this._location;
    }

    public void set_location(String _location) {
        this._location = _location;
    }

}