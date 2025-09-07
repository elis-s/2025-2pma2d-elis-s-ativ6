/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mariojp.solid.dip;

/**
 *
 * @author Usuario
 */
public class NoopMailSender implements MailSender {
    @Override
    public void send(String to, String subject, String body) {
        // Não faz nada (usado em DRY_RUN=true)
    }
}
