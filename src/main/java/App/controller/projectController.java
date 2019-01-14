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

    @RequestMapping(value = "/project/{id}", method = RequestMethod.GET, produces = "application/json")
    public String getproject(@PathVariable("id") Integer id) {

        String result = "";
        ObjectMapper mapper = new ObjectMapper();
        project proj = service.getProject(id);
        try {
            result = mapper.writeValueAsString(proj);

        } catch (Exception e) {
            System.out.print(e);
        }

        return result;
    }

    @RequestMapping(value = "/project", method = RequestMethod.GET, produces = "application/json")
    public String getAllprojects() {

        String result = "";
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<project> proj = service.getAllProjects();
        try {
            result = mapper.writeValueAsString(proj);

        } catch (Exception e) {
            System.out.print(e);
        }

        return result;
    }

}