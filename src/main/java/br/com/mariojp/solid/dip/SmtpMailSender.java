/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mariojp.solid.dip;

/**
 *
 * @author Usuario
 */
public class SmtpMailSender implements MailSender {

    private final SmtpClient smtpClient;

    public SmtpMailSender(SmtpClient smtpClient) {
        this.smtpClient = smtpClient;
    }

    @Override
    public void send(String to, String subject, String body) {
        smtpClient.send(to, subject, body);
    }
}
