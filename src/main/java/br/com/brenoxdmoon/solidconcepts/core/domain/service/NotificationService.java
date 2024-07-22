package br.com.brenoxdmoon.solidconcepts.core.domain.service;

import br.com.brenoxdmoon.solidconcepts.core.domain.entity.Employee;

/**
 * Esta interface está obedecendo ao Open/Closed Principle, pois para sempre que eu quiser adicionar uma nova forma de
 * notificação em meu sistema, basta extender dessa interface, sem precisar alterar uma classe já existente.
 */
public interface NotificationService {
    void sendNotification(Employee employee);
}
