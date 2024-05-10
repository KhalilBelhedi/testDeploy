package org.testspring.examenrev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.testspring.examenrev.entity.Donation;
@Repository
public interface IDonationRepository extends JpaRepository<Donation,Integer> {
}
