package com.test.springtaskdemo.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
//@Scheduled所支持的参数：
//1. cron：cron表达式，指定任务在特定时间执行；
//        2. fixedDelay：表示上一次任务执行完成后多久再次执行，参数类型为long，单位ms；
//        3. fixedDelayString：与fixedDelay含义一样，只是参数类型变为String；
//        4. fixedRate：表示按一定的频率执行任务，参数类型为long，单位ms；
//        5. fixedRateString: 与fixedRate的含义一样，只是将参数类型变为String；
//        6. initialDelay：表示延迟多久再第一次执行任务，参数类型为long，单位ms；
//        7. initialDelayString：与initialDelay的含义一样，只是将参数类型变为String；
//        8. zone：时区，默认为当前时区，一般没有用到。
@Component
public class TestTask2 {
    private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 6000)
    public void reportCurrentTime() {
        System.out.println("[" + Thread.currentThread().getName() + "]" + sdf.format(new Date()));
    }


}
