package com.maple.spider.entity;

/**
 * Created by alongsea2 on 16/10/8.
 */
public class CarCategory {
    private String type;
    private int id;
    private String name;
    private String url;
    private int cur;
    private int num;

    public int getCur() {
        return cur;
    }

    public void setCur(int cur) {
        this.cur = cur;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
