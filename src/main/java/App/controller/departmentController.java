package App.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class departmentController {

    @RequestMapping("/")
    public String index() {
        return "test test this is department endpoint";
    }

}