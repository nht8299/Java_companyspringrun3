package com.axonactive.companyspringrun3.Repositories;

import com.axonactive.companyspringrun3.Entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Integer> {
}
