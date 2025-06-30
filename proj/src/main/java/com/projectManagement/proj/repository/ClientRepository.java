package com.projectManagement.proj.repository;

import com.projectManagement.proj.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {


}
