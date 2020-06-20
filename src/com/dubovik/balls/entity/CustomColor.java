package com.dubovik.balls.entity;

public enum CustomColor{
    RED("red"),
    GREEN("green"),
    BLUE("blue");

    private String color_name;

    CustomColor(String in_name){
        color_name = in_name;
    }

    public String getColorName() {
        return color_name;
    }
}
