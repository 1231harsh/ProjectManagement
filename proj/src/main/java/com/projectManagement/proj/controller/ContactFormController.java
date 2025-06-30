package com.projectManagement.proj.controller;

import com.projectManagement.proj.entity.ContactForm;
import com.projectManagement.proj.service.ContactFormService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContactFormController {

    private final ContactFormService contactFormService;

    public ContactFormController(ContactFormService contactFormService) {
        this.contactFormService = contactFormService;
    }

    // Public - Submit a contact form
    @PostMapping("/contact")
    public ContactForm submitContactForm(@RequestBody ContactForm contactForm) {
        return contactFormService.saveContactForm(contactForm);
    }

    // Public - Get all contact forms
    @PostMapping("/admin/contacts")
    public List<ContactForm> getAllContactForms() {
        return contactFormService.getAllContactForms();
    }
}
