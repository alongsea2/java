package com.maple.spider.entity.dto;

import com.maple.spider.entity.CarCategory;
import com.maple.spider.queue.SpiderQueue;

import java.util.List;

/**
 * Created by dell on 2016/10/14.
 */
public class YiSpiderTaskDto implements Runnable{
    private String chars;
    private List<CarCategory> listCategory;

    public String getChars() {
        return chars;
    }

    public void setChars(String chars) {
        this.chars = chars;
    }

    public List<CarCategory> getListCategory() {
        return listCategory;
    }

    public void setListCategory(List<CarCategory> listCategory) {
        this.listCategory = listCategory;
    }

    @Override
    public void run() {
        System.out.println(SpiderQueue.flag);
        if(this.chars.equals("Z")){
            SpiderQueue.flag = false;
        }
    }
}
