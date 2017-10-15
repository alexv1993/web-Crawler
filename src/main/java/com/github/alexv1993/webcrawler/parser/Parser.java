package com.github.alexv1993.webcrawler.parser;

/**
 * Created by Alex
 * Класс, реализующий данный интерефейс,
 * должен будет отвечать за скачивание
 * страниц сайта и сохранение этих страниц
 * внутри страниц.
 * <p>
 * URL будут поступать из очередей.
 * <p>
 * При парсинге будет осуществляться контроль. Если странцу не удастся скачать, то произойдет ещё попыытка.
 * Если не удастся скачать по данному URL,
 * то новый URL будет отправлен в supervisor на доработку.
 */
public interface Parser {
    public void getTask();

    public String parse(String URL);

    public void saveToDB(String url, String page);

    public void sendNewURL(String URL);

    public void sendBadURL(String URL);
}
