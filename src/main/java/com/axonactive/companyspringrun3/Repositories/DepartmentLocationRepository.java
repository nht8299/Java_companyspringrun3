package com.axonactive.companyspringrun3.Repositories;

import com.axonactive.companyspringrun3.Entities.DepartmentLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentLocationRepository extends JpaRepository<DepartmentLocation,Integer> {

}
