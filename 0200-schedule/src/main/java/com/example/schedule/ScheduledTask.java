package com.example.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

/**
 * @author albert
 * @version 0.1
 * @since 3/12/20 4:53 PM
 */
@Component
@Slf4j
public class ScheduledTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedDelayString = "${jobs.fixedDelay}")
//  @Scheduled(fixedDelayString = "2000")
    public void getTask1() {
        log.info("任务1,从配置文件加载任务信息，当前时间：" + LocalDateTime.now());
    }

    @Scheduled(cron = "${jobs.cron}")
    public void getTask2() {
        log.info("任务2,从配置文件加载任务信息，当前时间：" + LocalDateTime.now());
    }
}