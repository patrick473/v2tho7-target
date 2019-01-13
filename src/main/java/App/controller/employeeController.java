package App.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {
    @RequestMapping(value="/employee")
    public String index() {
        return "test test this is employee endpoint";
    }
}