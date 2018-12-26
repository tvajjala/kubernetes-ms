package com.cloud.k8s.response.model;

import java.util.Properties;

/**
 * @author ThirupathiReddy Vajjala
 */
public class Response {


    private String id;

    private Integer totalRequests;


    private Properties systemProperties= System.getProperties();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTotalRequests() {
        return totalRequests;
    }

    public void setTotalRequests(Integer totalRequests) {
        this.totalRequests = totalRequests;
    }


    public Properties getSystemProperties() {
        return systemProperties;
    }

    public void setSystemProperties(Properties systemProperties) {
        this.systemProperties = systemProperties;
    }
}
