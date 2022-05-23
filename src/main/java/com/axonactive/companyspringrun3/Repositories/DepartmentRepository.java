package com.axonactive.companyspringrun3.Repositories;

import com.axonactive.companyspringrun3.Entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
