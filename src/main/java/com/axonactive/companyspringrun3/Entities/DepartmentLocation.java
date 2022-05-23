package com.axonactive.companyspringrun3.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentLocation {

    @Id
    private Integer id;

    @Column(length = 100)
    private String location;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;
}
