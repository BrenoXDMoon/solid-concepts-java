package br.com.brenoxdmoon.solidconcepts.core.domain.service.impl;

import br.com.brenoxdmoon.solidconcepts.core.domain.entity.Employee;
import br.com.brenoxdmoon.solidconcepts.core.domain.service.NotificationService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SmsServiceImpl implements NotificationService {
    @Override
    public void sendNotification(Employee employee) {
        log.info("Assuming a SMS notification for employee {}", employee);
    }
}
