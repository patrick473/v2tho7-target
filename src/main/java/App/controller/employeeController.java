package App.controller;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.model.employee;
import App.service.employeeService;

@RestController
public class employeeController {
    private employeeService service = new employeeService();

    @RequestMapping(value = "/test", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<employee> insert(@RequestBody employee emp) {

        if (emp != null) {
            service.insertEmployee(emp);
        }

        return new ResponseEntity<employee>(emp, HttpStatus.OK);
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET, produces = "application/json")
    public String getEmployee(@PathVariable("id") Integer id) {

        String result = "";
        ObjectMapper mapper = new ObjectMapper();
        employee emp = service.getEmployee(id);
        try {
            result = mapper.writeValueAsString(emp);

        } catch (Exception e) {
            System.out.print(e);
        }

        return result;
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET, produces = "application/json")
    public String getAllEmployees() {

        String result = "";
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<employee> emp = service.getAllEmployees();
        try {
            result = mapper.writeValueAsString(emp);

        } catch (Exception e) {
            System.out.print(e);
        }

        return result;
    }
}