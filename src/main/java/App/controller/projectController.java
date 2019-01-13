package App.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import App.service.projectService;
import App.model.project;

@RestController
public class projectController {

    private projectService service = new projectService();

    @RequestMapping(value = "/test", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<project> insert(@RequestBody project proj) {

        if (proj != null) {
            service.insertProject(proj);
        }

        return new ResponseEntity<project>(proj, HttpStatus.OK);
    }

}