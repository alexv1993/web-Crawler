package com.github.alexv1993.webcrawler.taskmanager;

/**
 * Created by Alex
 * <p>
 * Формирует задачи и кладет их о очередь
 */
public interface TaskManager {
    public void readFromDB();

    public void putToQueue();

}
