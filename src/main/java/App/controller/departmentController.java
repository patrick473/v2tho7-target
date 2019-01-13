package App.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import App.service.departmentService;
import App.model.department;

@RestController
public class departmentController {
    private departmentService service = new departmentService();

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ResponseEntity<department> insert(@RequestBody department dep) {

        if (dep != null) {
            service.insertDepartment(dep);
        }

        return new ResponseEntity<department>(dep, HttpStatus.OK);
    }
}