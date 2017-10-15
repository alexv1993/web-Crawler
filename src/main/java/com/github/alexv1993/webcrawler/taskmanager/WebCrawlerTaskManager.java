package com.github.alexv1993.webcrawler.taskmanager;

import com.github.alexv1993.webcrawler.dataSource.DataSource;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Alex
 */
public class WebCrawlerTaskManager implements TaskManager {
    //Источник данных(для общения с БД)
    private DataSource dataSource;
    private List<Task> innerTask;
    private Queue<Task> queue;


    public WebCrawlerTaskManager() {
        innerTask = new LinkedList<Task>();
    }

    public void readFromDB() {
        HashMap<String, String> inner = dataSource.getHashMap();

        for (HashMap.Entry<String, String> entry : inner.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Task task = new Task(key, value);
            innerTask.add(task);
        }
    }

    public void putToQueue() {
        for (Task task : innerTask) {
            queue.add(task);
        }
    }


    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Task> getInnerTask() {
        return innerTask;
    }

    public void setInnerTask(List<Task> innerTask) {
        this.innerTask = innerTask;
    }

    public Queue<Task> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Task> queue) {
        this.queue = queue;
    }
}
