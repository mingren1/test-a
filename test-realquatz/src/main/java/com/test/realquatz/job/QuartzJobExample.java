/*
 * RT MAP, Home of Professional MAP
 * Copyright  Bit Main Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 */
package com.test.realquatz.job;

/**
 * @author wangwenhao@rtmap.com
 * @project test-a
 * @package com.test.realquatz.job
 * @date 2018/12/14
 */
import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * quartz示例定时器类
 *
 * @author Administrator
 *
 */
public class QuartzJobExample implements Job {
    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "★★★★★★★★★★★");
    }
}
