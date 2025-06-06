/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.Gammatech.Coffees.Controllers;

/**
 *
 * Clase de respuesta para la autenticación de usuarios.
 * Contiene el token JWT generado al iniciar sesión.
 * @author Aaron
 */
public class AuthRequest {

    private String username;

    private String password;
    /**
     * 
     * Crea una nueva instancia de AuthRequest.
     * @param username Nombre de usuario
     * @param password Contraseña del usuario
     */
    public AuthRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
