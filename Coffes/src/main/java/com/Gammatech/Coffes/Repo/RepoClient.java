/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.Gammatech.Coffes.Repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.Gammatech.Coffes.Entities.Clients;

/**
 *
 * @author Usuario
 */
@Repository
public class RepoClient {

    private final Map<Long, Clients> clients = new HashMap<>();
    
    public List<Clients> findAll() {
        return List.copyOf(clients.values());
    }

    public Optional<Clients> findById(Long id) {
        return Optional.ofNullable(clients.get(id));
    }

    public Clients save(Clients clients) {
        this.clients.put(clients.getId(), clients);
        return clients;
    }

    public void delete(Long id) {
        clients.remove(id);
    }

    public Clients update(Clients clients) {
        this.clients.put(clients.getId(), clients);
        return clients;
    }
} 