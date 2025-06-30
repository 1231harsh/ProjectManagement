package com.projectManagement.proj.service;

import com.projectManagement.proj.entity.Client;
import com.projectManagement.proj.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    // Public - Get all clients
    public List<Client> getAllClients() {return clientRepository.findAll();}

    // Admin - Create a new client
    public Client createClient(Client client) {return clientRepository.save(client);}

    // Admin - Update an existing client
    public Client updateClient(Long id, Client client) {
        Client existingClient = clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found"));
        existingClient.setName(client.getName());
        existingClient.setDesignation(client.getDesignation());
        existingClient.setDesignation(client.getDesignation());
        existingClient.setImageUrl(client.getImageUrl());
        return clientRepository.save(existingClient);
    }

    // Admin - Delete a client
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
        return;
    }
}
