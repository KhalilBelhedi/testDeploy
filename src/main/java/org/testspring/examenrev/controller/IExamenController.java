package org.testspring.examenrev.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.testspring.examenrev.entity.Company;
import org.testspring.examenrev.entity.Employee;
import org.testspring.examenrev.service.IService;

@AllArgsConstructor
@RestController
@RequestMapping("/examen")
public class IExamenController {
    IService service;


    @PostMapping("/adcompany")
    public Company addCompany(Company company) {
        return service.addCompany(company);
    }

    @PostMapping("/addEmployeAndAssignToCompany/{campanyName}")
    public Employee addEmployeAndAssignToCompany(@RequestBody Employee employe,@PathVariable String campanyName) {
        return service.addEmployeAndAssignToCompany(employe, campanyName);
    }
}
