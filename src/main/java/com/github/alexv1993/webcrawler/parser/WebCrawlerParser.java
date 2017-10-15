package com.github.alexv1993.webcrawler.parser;

import com.github.alexv1993.webcrawler.dataSource.DataSource;
import com.github.alexv1993.webcrawler.supervisor.WebCrawlerSupervisor;
import com.github.alexv1993.webcrawler.taskmanager.WebCrawlerTaskManager;


/**
 * Created by Alex
 */
public class WebCrawlerParser implements Parser {
    private DataSource dataSource;
    private WebCrawlerSupervisor webCrawlerSupervisor;
    private WebCrawlerTaskManager webCrawlerTaskManager;

    //получение задач из очереди
    public void getTask() {
        webCrawlerTaskManager.getQueue().element();
    }


    //разбор сайта
    //возврат готовой страницы
    public String parse(String URL) {
        String result = "<html><header><title>This is title</title></header><body>Hello world</body ></html>";
        saveToDB(URL, result);
        return result;
    }


    //сохранение страницы в базу данных
    public void saveToDB(String url, String page) {
        dataSource.getHashMap().put(url, page);
    }


    //отправка наблюдателю необходиммой страницы
    //Можно использовать очередь для новых URL
    public void sendNewURL(String URL) {
        webCrawlerSupervisor.getNewURLqueue().add(URL);
    }


    //отправка  наблюдателю проблемного URL
    public void sendBadURL(String URL) {
        webCrawlerSupervisor.getBadUrlQueue().add(URL);
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public WebCrawlerSupervisor getWebCrawlerSupervisor() {
        return webCrawlerSupervisor;
    }

    public void setWebCrawlerSupervisor(WebCrawlerSupervisor webCrawlerSupervisor) {
        this.webCrawlerSupervisor = webCrawlerSupervisor;
    }

    public WebCrawlerTaskManager getWebCrawlerTaskManager() {
        return webCrawlerTaskManager;
    }

    public void setWebCrawlerTaskManager(WebCrawlerTaskManager webCrawlerTaskManager) {
        this.webCrawlerTaskManager = webCrawlerTaskManager;
    }
}
