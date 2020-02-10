package com.wagnxx.bean;

public class Clothes {
    private String id;
    private String brank ;//品牌
    private String style;
    private String color;
    private String size;
    private int num;
    private float price;
    private  String description;

    public Clothes() {
    }

    public Clothes(String id, String brank, String style, String color, String size, int num, float price, String description) {
        this.id = id;
        this.brank = brank;
        this.style = style;
        this.color = color;
        this.size = size;
        this.num = num;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrank() {
        return brank;
    }

    public void setBrank(String brank) {
        this.brank = brank;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "id='" + id + '\'' +
                ", brank='" + brank + '\'' +
                ", style='" + style + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", num=" + num +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
