package App.model;

public class department {
    private Integer departmentNumber;
    private String name;
    private String location;

    public department(Integer departmentNumber, String name, String location) {
        this.departmentNumber = departmentNumber;
        this.name = name;
        this.location = location;
    }

    public Integer getNumber() {
        return this.departmentNumber;
    }

    public void setNumber(Integer departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString(){
        return this.name + "" + this.location + " " + this.departmentNumber;
    }
}