/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mariojp.solid.dip;

/**
 *
 * @author Usuario
 */
public class MailSenderFactory {

    public static MailSender create() {
        
        String dryRun = System.getProperty("DRY_RUN");
        if ("true".equalsIgnoreCase(dryRun)) {
            return new NoopMailSender();
        }

        String smtpAvailable = System.getProperty("SMTP_AVAILABLE");
        if (!"true".equalsIgnoreCase(smtpAvailable)) {
            throw new IllegalStateException("SMTP not available!");
        }

        return new SmtpMailSender(new SmtpClient());
    }
}