package br.com.brenoxdmoon.solidconcepts.core.domain.service.impl;

import br.com.brenoxdmoon.solidconcepts.core.domain.entity.Employee;
import br.com.brenoxdmoon.solidconcepts.core.domain.service.NotificationService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailServiceImpl implements NotificationService {

    /**
     * Este método foi extraído da classe Employee.java, obedecendo ao Single Responsibility Principle,
     * pois o envio de e-mail é responsabilidade de um componente que emita notificações.
     */
    @Override
    public void sendNotification(Employee employee) {
        log.info("Assuming email notification");
    }
}
