package App.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import App.service.departmentService;
import App.model.department;

@RestController
public class departmentController {
    private departmentService service = new departmentService();

    @RequestMapping(value = "/new_department", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<department> insert(@RequestBody department dep) {

        if (dep != null) {
            service.insertDepartment(dep);
        }

        return new ResponseEntity<department>(dep, HttpStatus.OK);
    }

    @RequestMapping(value = "/change_department", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<department> update(@RequestBody department dep) {
        department exist = service.getDepartment(dep.getNumber());
        if (exist == null) {
            System.out.println("Unable to update. department with id " + dep.getNumber() + " not found");
            return new ResponseEntity<department>(HttpStatus.NOT_FOUND);
        }

        service.updateDepartment(dep);
        return new ResponseEntity<department>(dep, HttpStatus.OK);
    }

    @RequestMapping(value = "/remove_department/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<department> delete(@PathVariable("id") Integer id) {
        department dep = service.getDepartment(id);
        if (dep == null) {
            System.out.println("Unable to delete. Department with id " + id + " not found");
            return new ResponseEntity<department>(HttpStatus.NOT_FOUND);
        }

        service.deleteDepartment(id);
        return new ResponseEntity<department>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/department/{id}", method = RequestMethod.GET, produces = "application/json")
    public String getDepartment(@PathVariable("id") Integer id) {

        String result = "";
        ObjectMapper mapper = new ObjectMapper();
        department dep = service.getDepartment(id);
        try {
            result = mapper.writeValueAsString(dep);

        } catch (Exception e) {
            System.out.print(e);
        }

        return result;
    }

    @RequestMapping(value = "/department", method = RequestMethod.GET, produces = "application/json")
    public String getAllDepartments() {

        String result = "";
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<department> dep = service.getAllDepartments();
        try {
            result = mapper.writeValueAsString(dep);

        } catch (Exception e) {
            System.out.print(e);
        }

        return result;
    }

}