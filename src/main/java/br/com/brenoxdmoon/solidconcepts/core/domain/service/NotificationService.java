package br.com.brenoxdmoon.solidconcepts.core.domain.service;

import br.com.brenoxdmoon.solidconcepts.core.domain.entity.Employee;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NotificationService {

    /** Este método foi extraído da classe Employee.java, obedecendo ao Single Responsibility Principle,
     * pois o envio de e-mail é responsabilidade de um componente que emita notificações.
     */
    public void sendMail(Employee employee, String subject, String body) {
      log.info("Assuming email notification");
    }
}
