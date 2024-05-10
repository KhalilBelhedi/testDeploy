package org.testspring.examenrev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.testspring.examenrev.entity.RedCrescent;
@Repository
public interface IRedCrescentRepsoitory extends JpaRepository<RedCrescent,Integer> {
}
