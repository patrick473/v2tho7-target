package App.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class projectController {

    @RequestMapping(value="/project")
    public String index() {
        return "test test this is project endpoint";
    }

}