package com.birjuvachhani.recyclerviewexample;

/**
 * Created by birju.vachhani on 22/01/18.
 */

public class DataHolder {

    private int imageId;
    private String title;
    private String desc;
    private int thumbId;

    public DataHolder(int imageId, int thumbId, String title, String desc) {
        this.imageId = imageId;
        this.title = title;
        this.desc = desc;
        this.thumbId = thumbId;
    }

    public int getImageId() {
        return imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getThumbId() {
        return thumbId;
    }
}
