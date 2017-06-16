package com.mindflow.job.quartz.service;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @date 2017-02-28 19:57
 */
public class QuartzDemoService {
    private String url;
    private int priority;

    public QuartzDemoService(String url, int priority) {
        this.url = url;
        this.priority = priority;
    }

    public void run(){
        System.out.println("run...");
    }

    public String getUrl() {
        return url;
    }

    public int getPriority() {
        return priority;
    }
}
