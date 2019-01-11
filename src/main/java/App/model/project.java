package App.model;

public class project {
    private String _name;
    private Integer _projectNumber;
    private String _location;

    public project(String name, Integer projectNumber, String location) {
        this._name = name;
        this._projectNumber = projectNumber;
        this._location = location;
    }

    public String get_name() {
        return this._name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public Integer get_projectnumber() {
        return this._projectNumber;
    }

    public void set_projectnumber(Integer _projectNumber) {
        this._projectNumber = _projectNumber;
    }

    public String get_location() {
        return this._location;
    }

    public void set_location(String _location) {
        this._location = _location;
    }

}