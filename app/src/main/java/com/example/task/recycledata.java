package com.example.task;

public class recycledata
{
    int image;
    String title,date;


    public recycledata(int image, String title, String date) {
        this.image = image;
        this.title = title;
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String header) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDesc(String date) {
        this.date = date;
    }
}


