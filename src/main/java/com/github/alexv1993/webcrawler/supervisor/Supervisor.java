package com.github.alexv1993.webcrawler.supervisor;

/**
 * Created by Alex
 * <p>
 * Обозреватель. Через него осущемствляется наблюдение процессом
 */
public interface Supervisor {

    //Добавление нового URL в taskManager
    public void putNewURL(String URL);

    public void saveBadURL(String URL);
}
