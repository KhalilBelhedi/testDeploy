package org.testspring.examenrev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.testspring.examenrev.entity.Company;
@Repository
public interface ICompanyRepository extends JpaRepository<Company,Integer> {
    Company findByCompanyname(String name);
    

}
