import br.com.mariojp.solid.dip.*;

import br.com.mariojp.solid.dip.*;

public class Main {
    public static void main(String[] args) {
        // Configura a variável de ambiente para dry run
        System.setProperty("DRY_RUN", "true"); // desejável não chamar SMTP

        // Cria o MailSender correto usando a fábrica
        MailSender mailSender = MailSenderFactory.create();

        // Passa o MailSender para o EmailNotifier
        EmailNotifier notifier = new EmailNotifier(mailSender);

       notifier.notify("ana@example.com", "Bem-vinda!", "Olá Ana, seja bem-vinda!");

        System.out.println("Email enviado!");
    }
}
