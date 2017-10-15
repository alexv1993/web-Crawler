package com.github.alexv1993.webcrawler.crawler;

import com.github.alexv1993.webcrawler.dataSource.DataSource;

import java.util.HashMap;

/**
 * Created by Alex
 * <p>
 * Поисковый робот. Работает автономно. Кладет новые URL в базу данных
 */
public class WebCrawler implements Crawler {
    private DataSource dataSource;

    public WebCrawler() {

    }

    //поиск новых URL
    public void search() {

    }

    //Сохранение новых URL в базу данных
    public void writeToDB() {
        HashMap hashMap = dataSource.getHashMap();
        hashMap.put("key", "value");
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
