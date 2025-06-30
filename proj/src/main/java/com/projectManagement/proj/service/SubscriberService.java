package com.projectManagement.proj.service;

import com.projectManagement.proj.entity.Subscriber;
import com.projectManagement.proj.repository.SubscriberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriberService {

    private final SubscriberRepository subscriberRepository;

    public SubscriberService(SubscriberRepository subscriberRepository) {
        this.subscriberRepository = subscriberRepository;
    }

    public Subscriber saveSubscriber(Subscriber subscriber) {
        return subscriberRepository.save(subscriber);
    }

    public List<Subscriber> getAllSubscribers() {return subscriberRepository.findAll();}

}
