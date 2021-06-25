package com.pojo;
import java.util.HashMap;
import java.util.Map;
public class MonitorInfo {

    private Integer monitorCount;
    private String monitorsLink;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getMonitorCount() {
        return monitorCount;
    }

    public void setMonitorCount(Integer monitorCount) {
        this.monitorCount = monitorCount;
    }

    public String getMonitorsLink() {
        return monitorsLink;
    }

    public void setMonitorsLink(String monitorsLink) {
        this.monitorsLink = monitorsLink;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}