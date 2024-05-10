package org.testspring.examenrev.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.testspring.examenrev.entity.Company;
import org.testspring.examenrev.entity.Donation;
import org.testspring.examenrev.entity.DonationType;
import org.testspring.examenrev.entity.Employee;
import org.testspring.examenrev.repository.ICompanyRepository;
import org.testspring.examenrev.repository.IDonationRepository;
import org.testspring.examenrev.repository.IEmployeeRepository;

@Slf4j
@Service
@AllArgsConstructor
public class ServiceImpl  implements IService{

    ICompanyRepository companyRepository;
IEmployeeRepository employeeRepository;
IDonationRepository donationRepository;
    @Override
    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Employee addEmployeAndAssignToCompany(Employee employe, String campanyName) {
        Company company = companyRepository.findByCompanyname(campanyName);
        employe.setCompany(company);
        return employeeRepository.save(employe);
    }

    @Override
    public Donation addDonation(Donation donation) {
        if(donation.getType()== DonationType.BLOOD)
        {
            donation.setAmount(0);

        }
        return donationRepository.save(donation);

    }

}
