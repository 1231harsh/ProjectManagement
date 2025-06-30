package com.projectManagement.proj.controller;

import com.projectManagement.proj.entity.Subscriber;
import com.projectManagement.proj.service.SubscriberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SubscriberController {

    private final SubscriberService subscriberService;

    public SubscriberController(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    // Public - Subscribe to the newsletter
    @PostMapping("/subscribe")
    public ResponseEntity<?> createSubscriber(@RequestBody Subscriber subscriber) {
        Subscriber createdSubscriber = subscriberService.saveSubscriber(subscriber);
        return ResponseEntity.ok(createdSubscriber);
    }

    // Admin - Get all subscribers
    @PostMapping("/admin/subscribers")
    public ResponseEntity<?> getAllSubscribers() {
        return ResponseEntity.ok(subscriberService.getAllSubscribers());
    }
}
