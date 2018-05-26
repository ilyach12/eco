package com.chaikouski.ecology.controller;

import com.chaikouski.ecology.model.Associate;
import com.chaikouski.ecology.service.AssociateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AssociateController {

    private AssociateService service;

    public AssociateController(AssociateService service) {
        this.service = service;
    }

    @GetMapping("/associates")
    public ResponseEntity<Associate> get() {
        return new ResponseEntity(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/position/{position}")
    public ModelAndView getByPosition(@PathVariable String position) {
        return new ModelAndView("index", "byPosition", service.getByPosition(position));
    }

    @GetMapping("/surname/{lastName}")
    public ModelAndView getByLastName(@PathVariable String lastName) {
        return new ModelAndView("index", "byLastName", service.getByLastName(lastName));
    }

    @GetMapping("/associate/{id}")
    public ModelAndView getById(@PathVariable Long id) {
        return new ModelAndView("index", "byId", service.getById(id));
    }

    @PostMapping("/")
    public void save(@RequestBody Associate associate) {
        service.save(associate);
    }

    @PutMapping("/")
    public void update(@RequestBody Associate associate) {
        service.save(associate);
    }

    @DeleteMapping("/")
    public void delete(@RequestBody Associate associate) {
        service.delete(associate);
    }
}
