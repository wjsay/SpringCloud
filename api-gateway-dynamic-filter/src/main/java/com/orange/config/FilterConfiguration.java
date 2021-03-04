package com.orange.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yu
 * @date 2021/3/3 7:28 下午
 **/
@ConfigurationProperties("zuul.filter")
public class FilterConfiguration {
    private String root;
    private Integer interval;

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }
}
