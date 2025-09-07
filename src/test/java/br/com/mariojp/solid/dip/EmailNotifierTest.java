package br.com.mariojp.solid.dip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailNotifierTest {

    @Test
    void dry_run_should_not_touch_smtp() {
        System.setProperty("DRY_RUN", "true");
        System.clearProperty("SMTP_AVAILABLE"); // garante que SMTP real não será usado

        // Cria EmailNotifier usando a fábrica
        MailSender mailSender = MailSenderFactory.create();
        EmailNotifier notifier = new EmailNotifier(mailSender);

        assertDoesNotThrow(
                () -> notifier.notify("ana@example.com", "Bem-vinda!", "Olá Ana, seja bem-vinda!"),
            "Após refatoração (DIP), DRY_RUN deve evitar SMTP real");
    
    }
}