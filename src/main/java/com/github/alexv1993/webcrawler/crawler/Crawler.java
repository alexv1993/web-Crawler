package com.github.alexv1993.webcrawler.crawler;

/**
 * Created by Alex on 15.10.2017.
 * <p>
 * Класс, реализающий данный интерфейс
 * должен отвечать  за поиск новых URL и сохранение результатов поиска в базу
 */

public interface Crawler {
    public void search();

    public void writeToDB();
}
