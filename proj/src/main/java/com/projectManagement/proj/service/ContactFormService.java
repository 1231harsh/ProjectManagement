package com.projectManagement.proj.service;

import com.projectManagement.proj.entity.ContactForm;
import com.projectManagement.proj.repository.ContactFormRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactFormService {

    private final ContactFormRepository contactFormRepository;

    public ContactFormService(ContactFormRepository contactFormRepository) {
        this.contactFormRepository = contactFormRepository;
    }

    public ContactForm saveContactForm(ContactForm contactForm) {
        return contactFormRepository.save(contactForm);
    }

    public List<ContactForm> getAllContactForms() {return contactFormRepository.findAll();}
}
