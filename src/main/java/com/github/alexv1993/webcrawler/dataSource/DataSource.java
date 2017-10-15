package com.github.alexv1993.webcrawler.dataSource;

import java.util.HashMap;

/**
 * Created by Alex
 *
 * Класс-заглушка для источника данных. Key-value хранилище для url и страницы
 */
public class DataSource {
    private HashMap<String, String> hashMap;

    public HashMap<String, String> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, String> hashMap) {
        this.hashMap = hashMap;
    }
}
