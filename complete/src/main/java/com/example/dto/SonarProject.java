package com.example.dto;

/**
 * @author rumman
 * @since 06/05,2024
 */
public class SonarProject {

    private String name;
    private String key;

    public SonarProject() {
    }

    public SonarProject(String name, String key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
