package com.org.cts.controller;

import com.org.cts.model.Ministry;
import com.org.cts.service.MinistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MinistryController {
    @Autowired
    MinistryService ministryService;


    @PostMapping("/create")
    public void createMinistry(@RequestBody Ministry ministry){
        ministryService.createMinistry(ministry);
    }
@GetMapping("/getAll")
    public List<Ministry>getAll(){
    List<Ministry> list   =ministryService.getAll();
        return list;

}
@PutMapping("/update")
public String updateMinistry(@RequestBody Ministry ministry) {
    ministryService.updateMinistry(ministry);

    return "sss";
}

@DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
       String ss= ministryService.deleteById(id);
       return "naveen";

}



}
