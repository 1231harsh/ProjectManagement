package com.projectManagement.proj.repository;

import com.projectManagement.proj.entity.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactFormRepository extends JpaRepository<ContactForm, Long> {

}
