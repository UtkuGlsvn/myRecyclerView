package com.example.glsvn.recyclerview;

public class CustomClass {


    private String title;
    private int image;
    CustomClass(String title,int image)
    {
        this.title=title;
        this.image=image;
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

    public void setTitle(String title) {
        this.title = title;
    }
}