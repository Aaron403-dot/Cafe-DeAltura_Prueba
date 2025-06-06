/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.Gammatech.Coffees.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Gammatech.Coffees.Entities.Clients;

/**
 *
 * Repositorio para la entidad Clients.
 * Proporciona operaciones CRUD para la entidad Clients.
 * @author Aaron
 */
@Repository
public interface RepoClients extends JpaRepository<Clients, Long> {


}