package App.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
}