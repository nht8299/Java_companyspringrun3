package com.axonactive.companyspringrun3.Repositories;

import com.axonactive.companyspringrun3.Entities.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment,Integer> {
}
