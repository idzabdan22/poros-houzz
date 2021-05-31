package com.app.recyleviewhome.ui;

public class modalClass {
    private int image;
    private int text;
    private int desc;
    private String type;

    public modalClass (int image, int text, int desc, String type){
        this.image = image;
        this.text = text;
        this.desc = desc;
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getText() {
        return text;
    }

    public void setText(int text) {
        this.text = text;
    }

    public int getDesc() {
        return desc;
    }

    public void setDesc(int desc) {
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}




