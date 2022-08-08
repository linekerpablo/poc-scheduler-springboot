package com.poc.pushnotification.poc.services;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MedicamentsPushNotificationImpl {

    //Schedule com delay fixo
    @Scheduled(fixedDelay = 1000)
    @SchedulerLock(name = "medicamentsPushNotificationScheduledTask")
    @Async
    public void execute() throws InterruptedException {
        System.out.println(
                "Fixed delay task - " + System.currentTimeMillis() / 1000);

        Thread.sleep(4000);
    }

    //Schedule com tempo definido. Exemplo(rodar a cada 15 minutos)
    @Scheduled(cron = "0 0/15 * * * *")
    @SchedulerLock(name = "medicamentsCronPushNotificationScheduledTask")
    @Async
    public void executeCron() throws InterruptedException {
        //Aqui dentro chamar o método do BFF que fará o envio das notificações de medicamentos

        System.out.println(
                "Fixed delay task - " + System.currentTimeMillis() / 1000);

        Thread.sleep(4000);
    }
}
