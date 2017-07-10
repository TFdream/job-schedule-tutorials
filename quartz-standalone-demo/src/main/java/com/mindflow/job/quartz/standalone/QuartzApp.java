package com.mindflow.job.quartz.standalone;

import com.mindflow.job.quartz.standalone.service.QuartzDemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @date 2017-02-28 19:24
 */
public class QuartzApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        QuartzDemoService quartzDemoService = (QuartzDemoService) context.getBean("quartzDemoService");
        System.out.println(quartzDemoService);
    }
}
