package App.model;

public class project {
    private String name;
    private Integer projectNumber;
    private String location;

    public project(Integer projectNumber, String name, String location) {
        this.name = name;
        this.projectNumber = projectNumber;
        this.location = location;
    }

    public project() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProjectnumber() {
        return this.projectNumber;
    }

    public void setProjectnumber(Integer projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}