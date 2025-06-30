package com.projectManagement.proj.repository;

import com.projectManagement.proj.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
