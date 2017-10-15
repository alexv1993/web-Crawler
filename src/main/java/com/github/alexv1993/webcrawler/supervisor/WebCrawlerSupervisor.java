package com.github.alexv1993.webcrawler.supervisor;

import com.github.alexv1993.webcrawler.dataSource.DataSource;
import com.github.alexv1993.webcrawler.taskmanager.Task;
import com.github.alexv1993.webcrawler.taskmanager.WebCrawlerTaskManager;

import java.util.Queue;

/**
 * Created by Alex on
 */
public class WebCrawlerSupervisor implements Supervisor {
    private Queue<String> newURLqueue;
    private Queue<String> BadUrlQueue;
    private WebCrawlerTaskManager webCrawlerTaskManager;
    private DataSource dataSource;


    //Отправка нового URL в TaskManager
    public void putNewURL(String URL) {
        Task task = new Task();
        task.setURL(URL);
        webCrawlerTaskManager.getQueue().add(task);
    }


    //Сохранение плохого URL в базу
    public void saveBadURL(String URL) {
        dataSource.getHashMap().put(URL, "Value");
    }


    public Queue<String> getNewURLqueue() {
        return newURLqueue;
    }

    public void setNewURLqueue(Queue<String> newURLqueue) {
        this.newURLqueue = newURLqueue;
    }

    public Queue<String> getBadUrlQueue() {
        return BadUrlQueue;
    }

    public void setBadUrlQueue(Queue<String> badUrlQueue) {
        BadUrlQueue = badUrlQueue;
    }

    public WebCrawlerTaskManager getWebCrawlerTaskManager() {
        return webCrawlerTaskManager;
    }

    public void setWebCrawlerTaskManager(WebCrawlerTaskManager webCrawlerTaskManager) {
        this.webCrawlerTaskManager = webCrawlerTaskManager;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
