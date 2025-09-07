package br.com.mariojp.solid.dip;

public class EmailNotifier {

    private final MailSender mailSender;

    public EmailNotifier(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void notify(String to, String subject, String body) {
        mailSender.send(to, subject, body);
    }

    
}