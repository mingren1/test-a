package com.test.realquatz;

import com.test.realquatz.job.QuartzJobExample;
import com.test.realquatz.manager.QuartzManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {TestRealquatzApplication.class,TestRealquatzApplicationTests.class})
public class TestRealquatzApplicationTests {

//    @Autowired
//    private SchedulerFactoryBean schedulerFactoryBean;

    @Test
    public void quartz() {
        try {
//            Scheduler sche = schedulerFactoryBean.getScheduler();
            SchedulerFactory gSchedulerFactory = new StdSchedulerFactory();
            Scheduler sche = gSchedulerFactory.getScheduler();
            String job_name = "动态任务调度";
            System.out.println("【系统启动】开始(每1秒输出一次)...");
            QuartzManager.addJob(sche, job_name, QuartzJobExample.class, "0/1 * * * * ?");

            Thread.sleep(3000);
            System.out.println("【修改时间】开始(每2秒输出一次)...");
            QuartzManager.modifyJobTime(sche, job_name, "10/2 * * * * ?");
            Thread.sleep(4000);
            System.out.println("【移除定时】开始...");
            QuartzManager.removeJob(sche, job_name);
            System.out.println("【移除定时】成功");

            System.out.println("【再次添加定时任务】开始(每10秒输出一次)...");
            QuartzManager.addJob(sche, job_name, QuartzJobExample.class, "*/10 * * * * ?");
            Thread.sleep(30000);
            System.out.println("【移除定时】开始...");
            QuartzManager.removeJob(sche, job_name);
            System.out.println("【移除定时】成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

