/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.mariojp.solid.dip;

/**
 *
 * @author Usuario
 */
public interface MailSender {
    
    void send(String to, String subject, String body);

    
}
