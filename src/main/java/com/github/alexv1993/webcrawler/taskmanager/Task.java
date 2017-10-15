package com.github.alexv1993.webcrawler.taskmanager;

/**
 * Created by Alex
 */
public class Task {
    private String URL;
    private String value;

    public Task() {
    }

    public Task(String URL, String value) {
        this.URL = URL;
        this.value = value;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
