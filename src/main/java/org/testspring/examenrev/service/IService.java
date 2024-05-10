package org.testspring.examenrev.service;

import org.testspring.examenrev.entity.Company;
import org.testspring.examenrev.entity.Donation;
import org.testspring.examenrev.entity.Employee;

public interface IService {
    public Company addCompany(Company company );
    public Employee addEmployeAndAssignToCompany(Employee employe, String
            campanyName);
    public Donation addDonation(Donation donation);
}
